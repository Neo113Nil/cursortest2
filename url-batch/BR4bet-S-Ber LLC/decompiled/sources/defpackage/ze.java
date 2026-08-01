package defpackage;

import android.content.res.Resources;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class ze implements co {
    public final /* synthetic */ int f;

    @Override // defpackage.co
    public final Object g(Object obj) {
        switch (this.f) {
            case 0:
                we weVar = (we) obj;
                if (weVar instanceof bf) {
                    return (bf) weVar;
                }
                return null;
            default:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
        }
    }
}
