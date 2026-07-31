package E2;

import D2.AbstractC0348a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A extends B2.a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0370a f512a;

    /* renamed from: b, reason: collision with root package name */
    private final F2.b f513b;

    public A(AbstractC0370a lexer, AbstractC0348a json) {
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f512a = lexer;
        this.f513b = json.a();
    }

    @Override // B2.a, B2.e
    public byte A() {
        AbstractC0370a abstractC0370a = this.f512a;
        String s4 = abstractC0370a.s();
        try {
            return kotlin.text.u.a(s4);
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'UByte' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.a, B2.e
    public short E() {
        AbstractC0370a abstractC0370a = this.f512a;
        String s4 = abstractC0370a.s();
        try {
            return kotlin.text.u.j(s4);
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'UShort' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.c
    public F2.b a() {
        return this.f513b;
    }

    @Override // B2.a, B2.e
    public int j() {
        AbstractC0370a abstractC0370a = this.f512a;
        String s4 = abstractC0370a.s();
        try {
            return kotlin.text.u.d(s4);
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'UInt' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.a, B2.e
    public long q() {
        AbstractC0370a abstractC0370a = this.f512a;
        String s4 = abstractC0370a.s();
        try {
            return kotlin.text.u.g(s4);
        } catch (IllegalArgumentException unused) {
            AbstractC0370a.y(abstractC0370a, "Failed to parse type 'ULong' for input '" + s4 + '\'', 0, null, 6, null);
            throw new W1.f();
        }
    }

    @Override // B2.c
    public int t(A2.f descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }
}
