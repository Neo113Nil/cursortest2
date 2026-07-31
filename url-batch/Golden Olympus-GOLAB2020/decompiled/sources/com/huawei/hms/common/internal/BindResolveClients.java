package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public class BindResolveClients {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f14063b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<ResolveClientBean> f14064a;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final BindResolveClients f14065a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.f14065a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean contains;
        synchronized (f14063b) {
            contains = this.f14064a.contains(resolveClientBean);
        }
        return contains;
    }

    public void notifyClientReconnect() {
        synchronized (f14063b) {
            try {
                ListIterator<ResolveClientBean> listIterator = this.f14064a.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().clientReconnect();
                }
                this.f14064a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f14063b) {
            try {
                if (!this.f14064a.contains(resolveClientBean)) {
                    this.f14064a.add(resolveClientBean);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (f14063b) {
            try {
                if (this.f14064a.contains(resolveClientBean)) {
                    ListIterator<ResolveClientBean> listIterator = this.f14064a.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        } else if (resolveClientBean.equals(listIterator.next())) {
                            listIterator.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void unRegisterAll() {
        synchronized (f14063b) {
            this.f14064a.clear();
        }
    }

    private BindResolveClients() {
        this.f14064a = new ArrayList<>();
    }
}
