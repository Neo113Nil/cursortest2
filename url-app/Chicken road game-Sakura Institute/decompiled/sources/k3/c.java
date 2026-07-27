package k3;

import e2.C0559a;
import j3.AbstractC0724c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.B;
import kotlinx.serialization.descriptors.SerialDescriptor;
import y2.C1322B;
import y2.w;
import y2.y;

/* loaded from: classes.dex */
public final class c extends u3.l {

    /* renamed from: j, reason: collision with root package name */
    public final C0559a f7435j;

    /* renamed from: k, reason: collision with root package name */
    public final A0.q f7436k;

    public c(C0559a lexer, AbstractC0724c json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f7435j = lexer;
        this.f7436k = json.f7174b;
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final long e() {
        C0559a c0559a = this.f7435j;
        String k4 = c0559a.k();
        try {
            Intrinsics.checkNotNullParameter(k4, "<this>");
            y c4 = B.c(k4);
            if (c4 != null) {
                return c4.f11689d;
            }
            kotlin.text.t.e(k4);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'ULong' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    public final int l() {
        C0559a c0559a = this.f7435j;
        String k4 = c0559a.k();
        try {
            Intrinsics.checkNotNullParameter(k4, "<this>");
            Intrinsics.checkNotNullParameter(k4, "<this>");
            w b4 = B.b(k4);
            if (b4 != null) {
                return b4.f11686d;
            }
            kotlin.text.t.e(k4);
            throw null;
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'UInt' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // h3.a
    public final A0.q n() {
        return this.f7436k;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f A[Catch: IllegalArgumentException -> 0x0033, TryCatch #0 {IllegalArgumentException -> 0x0033, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x0024, B:9:0x002c, B:12:0x002f, B:13:0x0032), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[Catch: IllegalArgumentException -> 0x0033, TryCatch #0 {IllegalArgumentException -> 0x0033, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x0024, B:9:0x002c, B:12:0x002f, B:13:0x0032), top: B:2:0x0007 }] */
    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte r() {
        y2.u uVar;
        C0559a c0559a = this.f7435j;
        String k4 = c0559a.k();
        try {
            Intrinsics.checkNotNullParameter(k4, "<this>");
            Intrinsics.checkNotNullParameter(k4, "<this>");
            Intrinsics.checkNotNullParameter(k4, "<this>");
            w b4 = B.b(k4);
            if (b4 != null) {
                int i2 = b4.f11686d;
                if (Integer.compareUnsigned(i2, 255) <= 0) {
                    uVar = new y2.u((byte) i2);
                    if (uVar == null) {
                        return uVar.f11683d;
                    }
                    kotlin.text.t.e(k4);
                    throw null;
                }
            }
            uVar = null;
            if (uVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'UByte' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // h3.a
    public final int s(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[Catch: IllegalArgumentException -> 0x0034, TryCatch #0 {IllegalArgumentException -> 0x0034, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x0025, B:9:0x002d, B:12:0x0030, B:13:0x0033), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d A[Catch: IllegalArgumentException -> 0x0034, TryCatch #0 {IllegalArgumentException -> 0x0034, blocks: (B:3:0x0007, B:5:0x0018, B:7:0x0025, B:9:0x002d, B:12:0x0030, B:13:0x0033), top: B:2:0x0007 }] */
    @Override // u3.l, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short t() {
        C1322B c1322b;
        C0559a c0559a = this.f7435j;
        String k4 = c0559a.k();
        try {
            Intrinsics.checkNotNullParameter(k4, "<this>");
            Intrinsics.checkNotNullParameter(k4, "<this>");
            Intrinsics.checkNotNullParameter(k4, "<this>");
            w b4 = B.b(k4);
            if (b4 != null) {
                int i2 = b4.f11686d;
                if (Integer.compareUnsigned(i2, 65535) <= 0) {
                    c1322b = new C1322B((short) i2);
                    if (c1322b == null) {
                        return c1322b.f11656d;
                    }
                    kotlin.text.t.e(k4);
                    throw null;
                }
            }
            c1322b = null;
            if (c1322b == null) {
            }
        } catch (IllegalArgumentException unused) {
            C0559a.o(c0559a, "Failed to parse type 'UShort' for input '" + k4 + '\'', 0, null, 6);
            throw null;
        }
    }
}
