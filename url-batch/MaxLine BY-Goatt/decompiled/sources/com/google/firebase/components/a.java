package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.m = i;
        this.o = obj;
        this.n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        Object obj = this.n;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ((OptionalProvider) obj2).set((Provider) obj);
                break;
            case 1:
                ((LazySet) obj2).add((Provider) obj);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) obj2, (Event) obj);
                break;
        }
    }
}
