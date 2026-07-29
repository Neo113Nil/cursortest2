package com.tapjoy.internal;

import java.util.Observable;

/* loaded from: classes2.dex */
public final class ft {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8128a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final a f8129b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final a f8130c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final a f8131d = new a();
    public static final a e = new a();

    public static class a extends Observable {
        @Override // java.util.Observable
        public final void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }

        @Override // java.util.Observable
        public final void notifyObservers(Object obj) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
