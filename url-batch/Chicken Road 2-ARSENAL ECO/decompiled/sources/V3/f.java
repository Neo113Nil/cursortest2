package V3;

import N.p;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2719b;

    public /* synthetic */ f(int i7, Object obj) {
        this.f2718a = i7;
        this.f2719b = obj;
    }

    @Override // V3.g
    public final int a() {
        switch (this.f2718a) {
            case 0:
                return 6;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return 5;
            default:
                return 1;
        }
    }

    @Override // V3.g
    public final String b() {
        switch (this.f2718a) {
            case 0:
                return (String) ((List) this.f2719b).stream().map(new A4.b(20)).collect(Collectors.joining(", ", "[", "]"));
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (String) ((List) this.f2719b).stream().map(new A4.b(21)).collect(Collectors.joining(", ", "[", "]"));
            default:
                return (String) this.f2719b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f2718a) {
            case 0:
                if (this != obj) {
                    if (!(obj instanceof g) || !Objects.equals((List) this.f2719b, ((g) obj).getValue())) {
                    }
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                if (this != obj) {
                    if (!(obj instanceof g) || !Objects.equals((List) this.f2719b, ((g) obj).getValue())) {
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (!(obj instanceof g) || !Objects.equals((String) this.f2719b, ((g) obj).getValue())) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // V3.g
    public final Object getValue() {
        switch (this.f2718a) {
            case 0:
                return (List) this.f2719b;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return (List) this.f2719b;
            default:
                return (String) this.f2719b;
        }
    }

    public final int hashCode() {
        switch (this.f2718a) {
            case 0:
                return ((List) this.f2719b).hashCode();
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return ((List) this.f2719b).hashCode();
            default:
                return ((String) this.f2719b).hashCode();
        }
    }

    public final String toString() {
        switch (this.f2718a) {
            case 0:
                return "KeyValueList{" + b() + "}";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "ValueArray{" + b() + "}";
            default:
                return p.b(new StringBuilder("ValueString{"), (String) this.f2719b, "}");
        }
    }
}
