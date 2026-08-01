package xa;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b {
    Object getIAMData(String str, String str2, String str3, ld.a aVar);

    Object getIAMPreviewData(String str, String str2, ld.a aVar);

    Object listInAppMessages(String str, String str2, w9.b bVar, Function0<Long> function0, ld.a aVar);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z10, ld.a aVar);

    Object sendIAMImpression(String str, String str2, String str3, String str4, ld.a aVar);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, ld.a aVar);
}
