package defpackage;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Locale;
import java.util.Objects;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewy {
    public static final igc a;
    public static final ige b;

    static {
        Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
        creator.getClass();
        kdj kdjVar = new kdj(creator, false);
        int i = jzw.d;
        jzx jzxVar = new jzx("pfd-keys-bin", kdjVar);
        Logger logger = jxr.c;
        igc igcVar = new igc(jzxVar, new jxo("REQ-pfd-keys-bin", null), new jxo("RESH-pfd-keys-bin", null), new jxo("REST-pfd-keys-bin", null));
        a = igcVar;
        b = new ige(igcVar);
    }

    public static final String a(int i) {
        String str;
        String valueOf;
        switch (i) {
            case 2:
                str = "SYSTEM_APP_API_ITEM_TYPE_UNSPECIFIED";
                break;
            case 3:
                str = "SYSTEM_APP_API_ITEM_TYPE_ACCESSIBILITY_SETTINGS";
                break;
            case 4:
                str = "SYSTEM_APP_API_ITEM_TYPE_ACCOUNTS";
                break;
            case 5:
                str = "SYSTEM_APP_API_ITEM_TYPE_ALARMS";
                break;
            case 6:
                str = "SYSTEM_APP_API_ITEM_TYPE_APPS";
                break;
            case 7:
                str = "SYSTEM_APP_API_ITEM_TYPE_BROWSER_DATA";
                break;
            case 8:
                str = "SYSTEM_APP_API_ITEM_TYPE_CALENDARS";
                break;
            case 9:
                str = "SYSTEM_APP_API_ITEM_TYPE_CALENDARS_ATTACHMENTS";
                break;
            case 10:
                str = "SYSTEM_APP_API_ITEM_TYPE_CALENDARS_EVENTS";
                break;
            case 11:
                str = "SYSTEM_APP_API_ITEM_TYPE_CALL_LOGS";
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                str = "SYSTEM_APP_API_ITEM_TYPE_CONTACTS";
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                str = "SYSTEM_APP_API_ITEM_TYPE_CONTACTS_PHOTOS";
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                str = "SYSTEM_APP_API_ITEM_TYPE_FILES_AND_FOLDERS";
                break;
            case 15:
                str = "SYSTEM_APP_API_ITEM_TYPE_HOMESCREEN_LAYOUT";
                break;
            case 16:
                str = "SYSTEM_APP_API_ITEM_TYPE_MESSAGES";
                break;
            case 17:
                str = "SYSTEM_APP_API_ITEM_TYPE_MESSAGES_ATTACHMENTS";
                break;
            case 18:
                str = "SYSTEM_APP_API_ITEM_TYPE_MESSAGES_CONVERSATIONS";
                break;
            case 19:
                str = "SYSTEM_APP_API_ITEM_TYPE_MESSAGES_PARTICIPANTS";
                break;
            case 20:
                str = "SYSTEM_APP_API_ITEM_TYPE_MUSIC_PLAYLISTS";
                break;
            case 21:
                str = "SYSTEM_APP_API_ITEM_TYPE_MUSIC_TRACKS";
                break;
            case 22:
                str = "SYSTEM_APP_API_ITEM_TYPE_NOTES";
                break;
            case 23:
                str = "SYSTEM_APP_API_ITEM_TYPE_PASSWORDS_AND_PASSKEYS";
                break;
            case 24:
                str = "SYSTEM_APP_API_ITEM_TYPE_PHOTOS_AND_VIDEOS";
                break;
            case 25:
                str = "SYSTEM_APP_API_ITEM_TYPE_RECORDINGS";
                break;
            case 26:
                str = "SYSTEM_APP_API_ITEM_TYPE_WALLET_CARDS";
                break;
            case 27:
                str = "SYSTEM_APP_API_ITEM_TYPE_WALLPAPERS";
                break;
            case 28:
                str = "SYSTEM_APP_API_ITEM_TYPE_WIFI_CREDENTIALS";
                break;
            case 29:
                str = "SYSTEM_APP_API_ITEM_TYPE_NOTES_ATTACHMENTS";
                break;
            default:
                str = "UNRECOGNIZED";
                break;
        }
        String lowerCase = ksp.r(ksp.r(str, "SYSTEM_APP_API_ITEM_TYPE_", ""), "_", " ").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        char charAt = lowerCase.charAt(0);
        if (Character.isLowerCase(charAt)) {
            String valueOf2 = String.valueOf(charAt);
            valueOf2.getClass();
            valueOf = valueOf2.toUpperCase(Locale.ROOT);
            valueOf.getClass();
            if (valueOf.length() <= 1) {
                valueOf = String.valueOf(Character.toTitleCase(charAt));
            } else if (charAt != 329) {
                char charAt2 = valueOf.charAt(0);
                String substring = valueOf.substring(1);
                substring.getClass();
                String lowerCase2 = substring.toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                valueOf = charAt2 + lowerCase2;
            }
        } else {
            valueOf = String.valueOf(charAt);
        }
        String substring2 = lowerCase.substring(1);
        substring2.getClass();
        Objects.toString(valueOf);
        return String.valueOf(valueOf).concat(substring2);
    }
}
