package androidx.media2.common;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class SubtitleDataParcelizer {
    public static SubtitleData read(a aVar) {
        SubtitleData subtitleData = new SubtitleData();
        subtitleData.f1134a = aVar.y(subtitleData.f1134a, 1);
        subtitleData.f1135b = aVar.y(subtitleData.f1135b, 2);
        subtitleData.f1136c = aVar.m(subtitleData.f1136c, 3);
        return subtitleData;
    }

    public static void write(SubtitleData subtitleData, a aVar) {
        aVar.K(false, false);
        aVar.b0(subtitleData.f1134a, 1);
        aVar.b0(subtitleData.f1135b, 2);
        aVar.Q(subtitleData.f1136c, 3);
    }
}
