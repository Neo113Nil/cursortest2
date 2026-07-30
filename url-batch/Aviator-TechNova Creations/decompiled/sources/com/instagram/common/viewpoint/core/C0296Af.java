package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Af, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0296Af<K, V> extends AbstractC1864pV<Map.Entry<K, V>, V> {
    public C0296Af(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC1864pV
    @ParametricNullness
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V A01(Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
