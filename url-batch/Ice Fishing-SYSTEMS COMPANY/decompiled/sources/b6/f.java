package b6;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5569a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5570b;

    public /* synthetic */ f(int i, Object obj) {
        this.f5569a = i;
        this.f5570b = obj;
    }

    @Override // b6.g
    public final String a() {
        switch (this.f5569a) {
            case 0:
                return (String) ((List) this.f5570b).stream().map(new G6.b(20)).collect(Collectors.joining(", ", "[", "]"));
            case 1:
                return (String) ((List) this.f5570b).stream().map(new G6.b(21)).collect(Collectors.joining(", ", "[", "]"));
            default:
                return (String) this.f5570b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f5569a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f5570b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f5570b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((String) this.f5570b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // b6.g
    public final int getType() {
        switch (this.f5569a) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 1;
        }
    }

    @Override // b6.g
    public final Object getValue() {
        switch (this.f5569a) {
            case 0:
                return (List) this.f5570b;
            case 1:
                return (List) this.f5570b;
            default:
                return (String) this.f5570b;
        }
    }

    public final int hashCode() {
        switch (this.f5569a) {
            case 0:
                return ((List) this.f5570b).hashCode();
            case 1:
                return ((List) this.f5570b).hashCode();
            default:
                return ((String) this.f5570b).hashCode();
        }
    }

    public final String toString() {
        switch (this.f5569a) {
            case 0:
                return "KeyValueList{" + a() + "}";
            case 1:
                return "ValueArray{" + a() + "}";
            default:
                return AbstractC5051n.g(new StringBuilder("ValueString{"), (String) this.f5570b, "}");
        }
    }
}
