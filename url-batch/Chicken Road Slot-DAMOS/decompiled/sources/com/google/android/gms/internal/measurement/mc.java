package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class mc implements Comparable {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2536i = AtomicReferenceFieldUpdater.newUpdater(mc.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public final String f2537d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2538e;

    public /* synthetic */ mc(String str, byte[] bArr) {
        this.f2537d = str;
        this.f2538e = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        int i3 = 0;
        while (true) {
            Object obj = this.f2538e;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i3 >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i3])) {
                        return;
                    } else {
                        i3++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i3 = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2536i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bArr2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f2537d.compareTo((String) obj);
    }
}
