package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q8 {
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
