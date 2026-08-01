package te;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(re.e eVar, int i3) {
        super(eVar);
        this.f9337b = i3;
    }

    @Override // re.e
    public final String a() {
        switch (this.f9337b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
