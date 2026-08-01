package f0;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ Font.Builder g(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ ContentInfo.Builder j(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo l(Object obj) {
        return (ContentInfo) obj;
    }
}
