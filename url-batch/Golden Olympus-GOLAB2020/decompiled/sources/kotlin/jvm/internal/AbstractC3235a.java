package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3235a implements InterfaceC3248n, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AbstractC3235a(int i4, Class cls, String str, String str2, int i5) {
        this(i4, AbstractC3240f.NO_RECEIVER, cls, str, str2, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3235a)) {
            return false;
        }
        AbstractC3235a abstractC3235a = (AbstractC3235a) obj;
        return this.isTopLevel == abstractC3235a.isTopLevel && this.arity == abstractC3235a.arity && this.flags == abstractC3235a.flags && Intrinsics.areEqual(this.receiver, abstractC3235a.receiver) && Intrinsics.areEqual(this.owner, abstractC3235a.owner) && this.name.equals(abstractC3235a.name) && this.signature.equals(abstractC3235a.signature);
    }

    @Override // kotlin.jvm.internal.InterfaceC3248n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        Object obj = this.receiver;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return H.h(this);
    }

    public AbstractC3235a(int i4, Object obj, Class cls, String str, String str2, int i5) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = (i5 & 1) == 1;
        this.arity = i4;
        this.flags = i5 >> 1;
    }
}
