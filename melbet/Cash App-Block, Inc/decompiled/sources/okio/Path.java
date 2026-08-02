package okio;

import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.messagingplatformcommon.common.MessageType;
import com.squareup.protos.franklin.app.VerifyEmailResponse;
import com.squareup.protos.franklin.app.VerifySmsResponse;
import com.squareup.protos.franklin.common.PlayIntegrityAttestation;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Path implements Comparable {
    public static final String DIRECTORY_SEPARATOR;
    public final ByteString bytes;

    static {
        String str = File.separator;
        str.getClass();
        DIRECTORY_SEPARATOR = str;
    }

    public Path(ByteString byteString) {
        byteString.getClass();
        this.bytes = byteString;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Path path = (Path) obj;
        path.getClass();
        return this.bytes.compareTo(path.bytes);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.areEqual(((Path) obj).bytes, this.bytes);
    }

    public final ArrayList getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        ByteString byteString = this.bytes;
        if (access$rootLength == -1) {
            access$rootLength = 0;
        } else if (access$rootLength < byteString.getSize$okio() && byteString.internalGet$okio(access$rootLength) == 92) {
            access$rootLength++;
        }
        int size$okio = byteString.getSize$okio();
        int i = access$rootLength;
        while (access$rootLength < size$okio) {
            if (byteString.internalGet$okio(access$rootLength) == 47 || byteString.internalGet$okio(access$rootLength) == 92) {
                arrayList.add(byteString.substring(i, access$rootLength));
                i = access$rootLength + 1;
            }
            access$rootLength++;
        }
        if (i < byteString.getSize$okio()) {
            arrayList.add(byteString.substring(i, byteString.getSize$okio()));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.bytes.hashCode();
    }

    public final String name() {
        ByteString byteString = okio.internal.Path.SLASH;
        ByteString byteString2 = this.bytes;
        int lastIndexOf$default = ByteString.lastIndexOf$default(byteString2, byteString);
        if (lastIndexOf$default == -1) {
            lastIndexOf$default = ByteString.lastIndexOf$default(byteString2, okio.internal.Path.BACKSLASH);
        }
        if (lastIndexOf$default != -1) {
            byteString2 = ByteString.substring$default(byteString2, lastIndexOf$default + 1, 0, 2);
        } else if (volumeLetter() != null && byteString2.getSize$okio() == 2) {
            byteString2 = ByteString.EMPTY;
        }
        return byteString2.utf8();
    }

    public final Path parent() {
        ByteString byteString = okio.internal.Path.DOT;
        ByteString byteString2 = this.bytes;
        if (Intrinsics.areEqual(byteString2, byteString)) {
            return null;
        }
        ByteString byteString3 = okio.internal.Path.SLASH;
        if (Intrinsics.areEqual(byteString2, byteString3)) {
            return null;
        }
        ByteString byteString4 = okio.internal.Path.BACKSLASH;
        if (Intrinsics.areEqual(byteString2, byteString4)) {
            return null;
        }
        ByteString byteString5 = okio.internal.Path.DOT_DOT;
        byteString2.getClass();
        byteString5.getClass();
        int size$okio = byteString2.getSize$okio();
        byte[] bArr = byteString5.data;
        if (byteString2.rangeEquals(size$okio - bArr.length, bArr.length, byteString5) && (byteString2.getSize$okio() == 2 || byteString2.rangeEquals(byteString2.getSize$okio() - 3, 1, byteString3) || byteString2.rangeEquals(byteString2.getSize$okio() - 3, 1, byteString4))) {
            return null;
        }
        int lastIndexOf$default = ByteString.lastIndexOf$default(byteString2, byteString3);
        if (lastIndexOf$default == -1) {
            lastIndexOf$default = ByteString.lastIndexOf$default(byteString2, byteString4);
        }
        if (lastIndexOf$default == 2 && volumeLetter() != null) {
            if (byteString2.getSize$okio() == 3) {
                return null;
            }
            return new Path(ByteString.substring$default(byteString2, 0, 3, 1));
        }
        if (lastIndexOf$default == 1) {
            byteString4.getClass();
            if (byteString2.rangeEquals(0, byteString4.getSize$okio(), byteString4)) {
                return null;
            }
        }
        if (lastIndexOf$default != -1 || volumeLetter() == null) {
            return lastIndexOf$default == -1 ? new Path(byteString) : lastIndexOf$default == 0 ? new Path(ByteString.substring$default(byteString2, 0, 1, 1)) : new Path(ByteString.substring$default(byteString2, 0, lastIndexOf$default, 1));
        }
        if (byteString2.getSize$okio() == 2) {
            return null;
        }
        return new Path(ByteString.substring$default(byteString2, 0, 2, 1));
    }

    public final Path relativeTo(Path path) {
        path.getClass();
        ByteString byteString = path.bytes;
        int access$rootLength = okio.internal.Path.access$rootLength(this);
        ByteString byteString2 = this.bytes;
        Path path2 = access$rootLength == -1 ? null : new Path(byteString2.substring(0, access$rootLength));
        int access$rootLength2 = okio.internal.Path.access$rootLength(path);
        if (!Intrinsics.areEqual(path2, access$rootLength2 == -1 ? null : new Path(byteString.substring(0, access$rootLength2)))) {
            Path$$ExternalSyntheticBUOutline0.m$1("Paths of different roots cannot be relative to each other: ", this, " and ", path);
            return null;
        }
        ArrayList segmentsBytes = getSegmentsBytes();
        ArrayList segmentsBytes2 = path.getSegmentsBytes();
        int min = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i = 0;
        while (i < min && Intrinsics.areEqual(segmentsBytes.get(i), segmentsBytes2.get(i))) {
            i++;
        }
        if (i == min && byteString2.getSize$okio() == byteString.getSize$okio()) {
            return Companion.get(".", false);
        }
        if (segmentsBytes2.subList(i, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) != -1) {
            Path$$ExternalSyntheticBUOutline0.m$1("Impossible relative path to resolve: ", this, " and ", path);
            return null;
        }
        if (Intrinsics.areEqual(byteString, okio.internal.Path.DOT)) {
            return this;
        }
        Buffer buffer = new Buffer();
        ByteString slash = okio.internal.Path.getSlash(path);
        if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
            slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i2 = i; i2 < size; i2++) {
            buffer.m4333write(okio.internal.Path.DOT_DOT);
            buffer.m4333write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i < size2) {
            buffer.m4333write((ByteString) segmentsBytes.get(i));
            buffer.m4333write(slash);
            i++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    public final Path resolve(String str) {
        str.getClass();
        Buffer buffer = new Buffer();
        buffer.m4339writeUtf8(str);
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(buffer, false), false);
    }

    public final File toFile() {
        return new File(this.bytes.utf8());
    }

    public final String toString() {
        return this.bytes.utf8();
    }

    public final Character volumeLetter() {
        ByteString byteString = okio.internal.Path.SLASH;
        ByteString byteString2 = this.bytes;
        if (ByteString.indexOf$default(byteString2, byteString) != -1 || byteString2.getSize$okio() < 2 || byteString2.internalGet$okio(1) != 58) {
            return null;
        }
        char internalGet$okio = (char) byteString2.internalGet$okio(0);
        if (('a' > internalGet$okio || internalGet$okio >= '{') && ('A' > internalGet$okio || internalGet$okio >= '[')) {
            return null;
        }
        return Character.valueOf(internalGet$okio);
    }

    public final class Companion implements CoroutineContext.Key {
        public static GetAccountSettingsResponse.SettingName fromValue(int i) {
            switch (i) {
                case 1:
                    return GetAccountSettingsResponse.SettingName.SECURITY_LOCK;
                case 2:
                    return GetAccountSettingsResponse.SettingName.DEVICES;
                case 3:
                    return GetAccountSettingsResponse.SettingName.IDV;
                case 4:
                    return GetAccountSettingsResponse.SettingName.CASHTAG;
                case 5:
                    return GetAccountSettingsResponse.SettingName.INCOMING_REQUESTS;
                case 6:
                    return GetAccountSettingsResponse.SettingName.SYNC_CONTACTS;
                case 7:
                    return GetAccountSettingsResponse.SettingName.INVESTING_TRUSTED_CONTACT;
                case 8:
                    return GetAccountSettingsResponse.SettingName.TAXES_PASSWORD;
                case 9:
                    return GetAccountSettingsResponse.SettingName.TAXES_AUTH_APP;
                case 10:
                    return GetAccountSettingsResponse.SettingName.RECEIPTS;
                case 11:
                    return GetAccountSettingsResponse.SettingName.MESSAGES;
                case 12:
                    return GetAccountSettingsResponse.SettingName.ALIASES;
                case 13:
                    return GetAccountSettingsResponse.SettingName.ADDRESS;
                case 14:
                    return GetAccountSettingsResponse.SettingName.PIN;
                case 15:
                    return GetAccountSettingsResponse.SettingName.PASSKEYS;
                case 16:
                    return GetAccountSettingsResponse.SettingName.CREATE_BUSINESS_ACCOUNT;
                case 17:
                    return GetAccountSettingsResponse.SettingName.INVITE_TEEN;
                case 18:
                    return GetAccountSettingsResponse.SettingName.DOWNGRADE_TO_P2P;
                case 19:
                    return GetAccountSettingsResponse.SettingName.CREATE_PERSONAL_ACCOUNT;
                case 20:
                    return GetAccountSettingsResponse.SettingName.UPGRADE_TO_BUSINESS;
                case 21:
                case 22:
                case 23:
                default:
                    return null;
                case 24:
                    return GetAccountSettingsResponse.SettingName.SEARCH_PRIVACY;
                case 25:
                    return GetAccountSettingsResponse.SettingName.LINK_ACCOUNT;
                case 26:
                    return GetAccountSettingsResponse.SettingName.LINK_BANKS;
                case 27:
                    return GetAccountSettingsResponse.SettingName.MANAGE_FAVORITES;
                case 28:
                    return GetAccountSettingsResponse.SettingName.MANAGE_THEME;
                case 29:
                    return GetAccountSettingsResponse.SettingName.INVITE_FRIENDS;
                case 30:
                    return GetAccountSettingsResponse.SettingName.ENTER_CODE;
                case 31:
                    return GetAccountSettingsResponse.SettingName.CASH_PIN;
                case 32:
                    return GetAccountSettingsResponse.SettingName.VIEW_SHOPPING;
                case 33:
                    return GetAccountSettingsResponse.SettingName.VIEW_SECURITY_HUB;
            }
        }

        public static Path get(String str, boolean z) {
            str.getClass();
            ByteString byteString = okio.internal.Path.SLASH;
            Buffer buffer = new Buffer();
            buffer.m4339writeUtf8(str);
            return okio.internal.Path.toPath(buffer, z);
        }

        public static Path get(File file, boolean z) {
            file.getClass();
            String file2 = file.toString();
            file2.getClass();
            return get(file2, z);
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static VerifySmsResponse.Status m4348fromValue(int i) {
            if (i == 0) {
                return VerifySmsResponse.Status.INVALID;
            }
            if (i == 1) {
                return VerifySmsResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return VerifySmsResponse.Status.INVALID_SMS_NUMBER;
            }
            if (i == 3) {
                return VerifySmsResponse.Status.INVALID_VERIFICATION_CODE;
            }
            if (i == 4) {
                return VerifySmsResponse.Status.EXPIRED_VERIFICATION_CODE;
            }
            if (i == 5) {
                return VerifySmsResponse.Status.TOO_MANY_FAILED_ATTEMPTS;
            }
            if (i != 7) {
                return null;
            }
            return VerifySmsResponse.Status.NOT_ELIGIBLE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static VerifyEmailResponse.Status m4347fromValue(int i) {
            if (i == 0) {
                return VerifyEmailResponse.Status.INVALID;
            }
            if (i == 1) {
                return VerifyEmailResponse.Status.SUCCESS;
            }
            if (i == 2) {
                return VerifyEmailResponse.Status.INVALID_EMAIL_ADDRESS;
            }
            if (i == 3) {
                return VerifyEmailResponse.Status.INVALID_VERIFICATION_CODE;
            }
            if (i == 4) {
                return VerifyEmailResponse.Status.EXPIRED_VERIFICATION_CODE;
            }
            if (i == 5) {
                return VerifyEmailResponse.Status.TOO_MANY_FAILED_ATTEMPTS;
            }
            if (i != 7) {
                return null;
            }
            return VerifyEmailResponse.Status.NOT_ELIGIBLE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static MessageType m4346fromValue(int i) {
            switch (i) {
                case 1:
                    return MessageType.ADVERTISING;
                case 2:
                    return MessageType.INFORMATION;
                case 3:
                    return MessageType.USER_ACTIVITY;
                case 4:
                    return MessageType.CRITICAL;
                case 5:
                    return MessageType.TRANSACTIONAL_CRITICAL;
                case 6:
                    return MessageType.TRANSACTIONAL_URGENT_ACCOUNT_NOTICE;
                case 7:
                    return MessageType.TRANSACTIONAL_CUSTOMER_DRIVEN_MESSAGING;
                case 8:
                    return MessageType.TRANSACTIONAL_NON_URGENT_ACCOUNT_NOTICE;
                case 9:
                    return MessageType.MARKETING_ONBOARDING_AND_EDUCATION;
                case 10:
                    return MessageType.MARKETING_ENGAGEMENT;
                case 11:
                    return MessageType.MARKETING_CROSS_SELL;
                case 12:
                    return MessageType.MARKETING_BRAND;
                case 13:
                    return MessageType.MARKETING_TIME_SENSITIVE;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static PlayIntegrityAttestation.Status m4349fromValue(int i) {
            switch (i) {
                case 0:
                    return PlayIntegrityAttestation.Status.DO_NOT_USE;
                case 1:
                    return PlayIntegrityAttestation.Status.FAILED;
                case 2:
                    return PlayIntegrityAttestation.Status.COMPLETED;
                case 3:
                    return PlayIntegrityAttestation.Status.INTEGRITY_CHECK_EXCEPTION;
                case 4:
                    return PlayIntegrityAttestation.Status.SAFETY_NET_API_UNAVAILABLE;
                case 5:
                    return PlayIntegrityAttestation.Status.TOO_MANY_RETRIES;
                case 6:
                    return PlayIntegrityAttestation.Status.INTERRUPTED_EXCEPTION;
                case 7:
                    return PlayIntegrityAttestation.Status.TIMEOUT_EXCEPTION;
                case 8:
                    return PlayIntegrityAttestation.Status.SUCCESSFUL;
                case 9:
                    return PlayIntegrityAttestation.Status.PLAY_SERVICES_UNAVAILABLE;
                case 10:
                    return PlayIntegrityAttestation.Status.STANDARD_INTEGRITY_EXCEPTION;
                default:
                    return null;
            }
        }
    }
}
