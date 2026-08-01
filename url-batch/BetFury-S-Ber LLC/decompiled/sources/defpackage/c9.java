package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.view.ContentInfo;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c9 {
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
