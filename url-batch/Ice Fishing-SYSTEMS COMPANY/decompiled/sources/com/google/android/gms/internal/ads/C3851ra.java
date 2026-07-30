package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import b.C0518b;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC4846f;
import p.AbstractServiceConnectionC4851k;
import p.C4850j;

/* renamed from: com.google.android.gms.internal.ads.ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3851ra extends AbstractServiceConnectionC4851k {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f34041n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public Context f34042u;

    /* renamed from: v, reason: collision with root package name */
    public C3165eo f34043v;

    /* renamed from: w, reason: collision with root package name */
    public f4.p f34044w;

    /* renamed from: x, reason: collision with root package name */
    public C4850j f34045x;

    @Override // p.AbstractServiceConnectionC4851k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4846f abstractC4846f) {
        this.f34045x = (C4850j) abstractC4846f;
        try {
            ((C0518b) abstractC4846f.f39754a).N0();
        } catch (RemoteException unused) {
        }
        this.f34044w = abstractC4846f.c(new C3798qa(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f34045x = null;
        this.f34044w = null;
    }
}
