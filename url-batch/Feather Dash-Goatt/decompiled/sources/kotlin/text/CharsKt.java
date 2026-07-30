package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/CharsKt__CharJVMKt", "kotlin/text/a"}, d2 = {}, k = 4, mv = {2, 2, InstallReferrerClient.InstallReferrerResponse.OK}, xi = 49)
/* loaded from: classes.dex */
public final class CharsKt extends a {
    public static boolean a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
