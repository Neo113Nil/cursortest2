package kotlinx.coroutines.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class Symbol {
    public final /* synthetic */ int $r8$classId;
    public final String symbol;

    public Symbol(Context context) {
        this.$r8$classId = 3;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        applicationInfo.getClass();
        String string2 = applicationInfo.metaData.getString("com.squareup.netcetera.API_KEY");
        string2.getClass();
        this.symbol = string2;
    }

    public String getFor(Object obj) {
        String obj2 = obj.toString();
        if (obj2 != null && obj2.length() != 0) {
            int length = obj2.length();
            int i = 0;
            while (i < length) {
                int codePointAt = obj2.codePointAt(i);
                if (Character.isLetterOrDigit(codePointAt)) {
                    i += Character.charCount(codePointAt);
                }
            }
            return this.symbol + obj;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("Invalid key: ", obj2));
        return null;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("<"), this.symbol, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Symbol(String str, int i) {
        this.$r8$classId = i;
        this.symbol = str;
    }

    public Symbol(String str) {
        this.$r8$classId = 1;
        this.symbol = str.concat("_");
    }
}
