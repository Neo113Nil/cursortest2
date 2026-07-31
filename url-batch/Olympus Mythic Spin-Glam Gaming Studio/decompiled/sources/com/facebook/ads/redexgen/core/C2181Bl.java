package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2181Bl<K, V> extends C3619nh<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ C3619nh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181Bl(final C3619nh this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Map.Entry<K, V> A03(int entry) {
        return new C2178Bi(this.A00, entry);
    }
}
