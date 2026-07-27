package s0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I0 implements r0.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f10056d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10057e;

    /* renamed from: i, reason: collision with root package name */
    public Float f10058i = null;

    /* renamed from: j, reason: collision with root package name */
    public Float f10059j = null;

    /* renamed from: k, reason: collision with root package name */
    public y0.g f10060k = null;

    /* renamed from: l, reason: collision with root package name */
    public y0.g f10061l = null;

    public I0(int i2, ArrayList arrayList) {
        this.f10056d = i2;
        this.f10057e = arrayList;
    }

    @Override // r0.h0
    public final boolean N() {
        return this.f10057e.contains(this);
    }
}
