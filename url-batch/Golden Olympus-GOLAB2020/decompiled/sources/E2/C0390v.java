package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0390v extends C0383n {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0348a f623c;

    /* renamed from: d, reason: collision with root package name */
    private int f624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390v(Q writer, AbstractC0348a json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f623c = json;
    }

    @Override // E2.C0383n
    public void b() {
        n(true);
        this.f624d++;
    }

    @Override // E2.C0383n
    public void c() {
        n(false);
        j("\n");
        int i4 = this.f624d;
        for (int i5 = 0; i5 < i4; i5++) {
            j(this.f623c.d().j());
        }
    }

    @Override // E2.C0383n
    public void o() {
        e(' ');
    }

    @Override // E2.C0383n
    public void p() {
        this.f624d--;
    }
}
