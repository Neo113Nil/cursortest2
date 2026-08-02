package E;

import org.json.JSONObject;

/* renamed from: E.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f291b;

    /* renamed from: c, reason: collision with root package name */
    public int f292c;

    public /* synthetic */ C0009j() {
    }

    public String toString() {
        switch (this.f290a) {
            case 1:
                return "LayoutState{mAvailable=0, mCurrentPosition=0, mItemDirection=0, mLayoutDirection=0, mStartLine=" + this.f291b + ", mEndLine=" + this.f292c + '}';
            default:
                return super.toString();
        }
    }

    public C0009j(JSONObject jSONObject) {
        this.f291b = jSONObject.getInt("commitmentPaymentsCount");
        this.f292c = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }

    public C0009j(int i3, int i4) {
        this.f291b = i3;
        this.f292c = i4;
    }
}
