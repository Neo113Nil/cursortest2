package C4;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f313b;

    public /* synthetic */ i(int i2, Object obj) {
        this.f312a = i2;
        this.f313b = obj;
    }

    @Override // C4.j
    public final String a() {
        switch (this.f312a) {
            case 0:
                return (String) ((List) this.f313b).stream().map(new a(2)).collect(Collectors.joining(", ", "[", "]"));
            case 1:
                return (String) ((List) this.f313b).stream().map(new a(3)).collect(Collectors.joining(", ", "[", "]"));
            default:
                return (String) this.f313b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f312a) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof j) || !Objects.equals((List) this.f313b, ((j) obj).getValue())) {
                    }
                }
                break;
            case 1:
                if (this != obj) {
                    if (!(obj instanceof j) || !Objects.equals((List) this.f313b, ((j) obj).getValue())) {
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (!(obj instanceof j) || !Objects.equals((String) this.f313b, ((j) obj).getValue())) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // C4.j
    public final int getType() {
        switch (this.f312a) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 1;
        }
    }

    @Override // C4.j
    public final Object getValue() {
        switch (this.f312a) {
            case 0:
                return (List) this.f313b;
            case 1:
                return (List) this.f313b;
            default:
                return (String) this.f313b;
        }
    }

    public final int hashCode() {
        switch (this.f312a) {
            case 0:
                return ((List) this.f313b).hashCode();
            case 1:
                return ((List) this.f313b).hashCode();
            default:
                return ((String) this.f313b).hashCode();
        }
    }

    public final String toString() {
        switch (this.f312a) {
            case 0:
                return "KeyValueList{" + a() + "}";
            case 1:
                return "ValueArray{" + a() + "}";
            default:
                return r4.f.f(new StringBuilder("ValueString{"), (String) this.f313b, "}");
        }
    }
}
