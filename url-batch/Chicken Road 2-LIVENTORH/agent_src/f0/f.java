package f0;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract /* synthetic */ class f {
    public static /* synthetic */ Font.Builder f(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }
}
