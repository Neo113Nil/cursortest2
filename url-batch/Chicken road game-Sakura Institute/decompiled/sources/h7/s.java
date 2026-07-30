package h7;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class s implements l3.q {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4706f;

    /* renamed from: g, reason: collision with root package name */
    public String f4707g;

    @Override // l3.q
    public boolean f(CharSequence charSequence, int i7, int i8, l3.v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i7, i8), this.f4707g)) {
            return true;
        }
        vVar.f5939c = (vVar.f5939c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f4706f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "<" + this.f4707g + '>';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s(String str, int i7) {
        this.f4706f = i7;
        this.f4707g = str;
    }

    @Override // l3.q
    public Object a() {
        return this;
    }
}
