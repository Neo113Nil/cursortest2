package com.facebook.internal;

import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CallbackManagerImpl.java */
/* loaded from: classes.dex */
public final class e implements com.facebook.e {

    /* renamed from: a, reason: collision with root package name */
    private static Map<Integer, a> f6108a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<Integer, a> f6109b = new HashMap();

    /* compiled from: CallbackManagerImpl.java */
    public interface a {
        boolean a(int i, Intent intent);
    }

    public static synchronized void a(int i, a aVar) {
        synchronized (e.class) {
            ac.a(aVar, "callback");
            if (f6108a.containsKey(Integer.valueOf(i))) {
                return;
            }
            f6108a.put(Integer.valueOf(i), aVar);
        }
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (e.class) {
            aVar = f6108a.get(num);
        }
        return aVar;
    }

    private static boolean b(int i, int i2, Intent intent) {
        a a2 = a(Integer.valueOf(i));
        if (a2 != null) {
            return a2.a(i2, intent);
        }
        return false;
    }

    public void b(int i, a aVar) {
        ac.a(aVar, "callback");
        this.f6109b.put(Integer.valueOf(i), aVar);
    }

    @Override // com.facebook.e
    public boolean a(int i, int i2, Intent intent) {
        a aVar = this.f6109b.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.a(i2, intent);
        }
        return b(i, i2, intent);
    }

    /* compiled from: CallbackManagerImpl.java */
    public enum b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);

        private final int j;

        b(int i) {
            this.j = i;
        }

        public int a() {
            return com.facebook.l.n() + this.j;
        }
    }
}
