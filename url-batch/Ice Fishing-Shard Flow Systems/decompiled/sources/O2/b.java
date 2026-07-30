package O2;

import kotlin.jvm.functions.Function0;
import o2.C0800b;

/* loaded from: classes.dex */
public interface b {
    Object getIAMData(String str, String str2, String str3, V5.b bVar);

    Object getIAMPreviewData(String str, String str2, V5.b bVar);

    Object listInAppMessages(String str, String str2, C0800b c0800b, Function0<Long> function0, V5.b bVar);

    Object listInAppMessagesIv(String str, String str2, String str3, String str4, C0800b c0800b, Function0<Long> function0, String str5, V5.b bVar);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z7, V5.b bVar);

    Object sendIAMImpression(String str, String str2, String str3, String str4, V5.b bVar);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, V5.b bVar);
}
