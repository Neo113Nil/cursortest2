package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network.dex */
public final class K8 implements Comparable<K8> {
    public final int A00;
    public final C0546Jz A01;

    public K8(int i, C0546Jz c0546Jz) {
        this.A00 = i;
        this.A01 = c0546Jz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(K8 k8) {
        return Integer.compare(this.A00, k8.A00);
    }
}
