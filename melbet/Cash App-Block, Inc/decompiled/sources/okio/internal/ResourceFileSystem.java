package okio.internal;

import com.squareup.protos.cash.badging.api.ItemType;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import com.squareup.protos.cash.messagingplatformcommon.placements.Placement;
import com.squareup.protos.franklin.app.ConfirmPasscodeResponse;
import com.squareup.protos.franklin.app.GetUnredactedIssuedCardResponse$Status;
import com.squareup.protos.franklin.app.RegisterEmailResponse;
import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.protos.franklin.common.SyncEntityType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import okio.Buffer;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Okio;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Sink;
import okio.Source;
import papa.internal.AppUpdateDetector$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ResourceFileSystem extends FileSystem {
    public static final Path ROOT;
    public final ClassLoader classLoader;
    public final Lazy roots$delegate;
    public final FileSystem systemFileSystem;

    static {
        String str = Path.DIRECTORY_SEPARATOR;
        ROOT = Path.Companion.get("/", false);
    }

    public ResourceFileSystem(ClassLoader classLoader) {
        classLoader.getClass();
        JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
        jvmSystemFileSystem.getClass();
        this.classLoader = classLoader;
        this.systemFileSystem = jvmSystemFileSystem;
        this.roots$delegate = LazyKt.lazy(new AppUpdateDetector$$ExternalSyntheticLambda0(this, 14));
    }

    public static String toRelativePath(Path path) {
        Path path2 = ROOT;
        path2.getClass();
        path.getClass();
        return Path.commonResolve(path2, path, true).relativeTo(path2).bytes.utf8();
    }

    @Override // okio.FileSystem
    public final Sink appendingSink(Path path) {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void atomicMove(Path path, Path path2) {
        path.getClass();
        path2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void createDirectory(Path path) {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final void delete(Path path, boolean z) {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final List list(Path path) {
        path.getClass();
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (Pair pair : (List) this.roots$delegate.getValue()) {
            FileSystem fileSystem = (FileSystem) pair.first;
            Path path2 = (Path) pair.second;
            try {
                List list = fileSystem.list(path2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.access$keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Companion.removeBase((Path) it.next(), path2));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return CollectionsKt.toList(linkedHashSet);
        }
        Path$$ExternalSyntheticBUOutline0.m$2(path, "file not found: ");
        return null;
    }

    @Override // okio.FileSystem
    public final List listOrNull(Path path) {
        path.getClass();
        String relativePath = toRelativePath(path);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((List) this.roots$delegate.getValue()).iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair pair = (Pair) it.next();
            FileSystem fileSystem = (FileSystem) pair.first;
            Path path2 = (Path) pair.second;
            List listOrNull = fileSystem.listOrNull(path2.resolve(relativePath));
            if (listOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listOrNull) {
                    if (Companion.access$keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it2.next(), path2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, linkedHashSet);
                z = true;
            }
        }
        if (z) {
            return CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileMetadata metadataOrNull(Path path) {
        path.getClass();
        if (!Companion.access$keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair pair : (List) this.roots$delegate.getValue()) {
            FileMetadata metadataOrNull = ((FileSystem) pair.first).metadataOrNull(((Path) pair.second).resolve(relativePath));
            if (metadataOrNull != null) {
                return metadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public final FileHandle openReadOnly(Path path) {
        path.getClass();
        if (!Companion.access$keepPath(path)) {
            Path$$ExternalSyntheticBUOutline0.m$2(path, "file not found: ");
            return null;
        }
        String relativePath = toRelativePath(path);
        Iterator it = ((List) this.roots$delegate.getValue()).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            try {
                return ((FileSystem) pair.first).openReadOnly(((Path) pair.second).resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        Path$$ExternalSyntheticBUOutline0.m$2(path, "file not found: ");
        return null;
    }

    @Override // okio.FileSystem
    public final Sink sink(Path path, boolean z) {
        path.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public final Source source(Path path) {
        path.getClass();
        if (!Companion.access$keepPath(path)) {
            Path$$ExternalSyntheticBUOutline0.m$2(path, "file not found: ");
            return null;
        }
        Path path2 = ROOT;
        path2.getClass();
        URL resource = this.classLoader.getResource(Path.commonResolve(path2, path, false).relativeTo(path2).bytes.utf8());
        if (resource == null) {
            Path$$ExternalSyntheticBUOutline0.m$2(path, "file not found: ");
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        if (openConnection instanceof JarURLConnection) {
            ((JarURLConnection) openConnection).setUseCaches(false);
        }
        InputStream inputStream = openConnection.getInputStream();
        inputStream.getClass();
        return Okio.source(inputStream);
    }

    public final class Companion {
        public static final boolean access$keepPath(Path path) {
            Path path2 = ResourceFileSystem.ROOT;
            return !StringsKt__StringsJVMKt.endsWith(path.name(), ".class", true);
        }

        public static ArrayList alpnProtocolNames(List list) {
            list.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Protocol) obj) != Protocol.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Protocol) it.next()).protocol);
            }
            return arrayList2;
        }

        public static byte[] concatLengthPrefixed(List list) {
            list.getClass();
            Buffer buffer = new Buffer();
            Iterator it = alpnProtocolNames(list).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                buffer.m4335writeByte(str.length());
                buffer.m4339writeUtf8(str);
            }
            return buffer.readByteArray(buffer.size);
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static Placement m4352fromValue(int i) {
            switch (i) {
                case 0:
                    return Placement.PLACEMENT_UNSPECIFIED;
                case 1:
                    return Placement.TEST_PLACEMENT;
                case 2:
                    return Placement.BOOST_CAROUSEL;
                case 3:
                    return Placement.BOTTOM_NAV_MONEY_TAB;
                case 4:
                    return Placement.BOTTOM_NAV_ACTIVITY_TAB;
                case 5:
                    return Placement.BOTTOM_NAV_DISCOVER_TAB;
                case 6:
                    return Placement.BOTTOM_NAV_WALLET_TAB;
                case 7:
                    return Placement.TOOLBAR_NAV_QR_TAB;
                case 8:
                    return Placement.TOOLBAR_NAV_GLOBE_TAB;
                case 9:
                    return Placement.TOOLBAR_NAV_SETTING_TAB;
                case 10:
                    return Placement.TOOLBAR_NAV_PROFILE_TAB;
                case 11:
                    return Placement.RECIPIENT_SELECTOR_PERSONALIZE_PAYMENT_BUTTON;
                case 12:
                    return Placement.TOOLBAR_NAV_DISCOVER_TAB;
                case 13:
                    return Placement.BALANCE_APPLET_TILE;
                case 14:
                    return Placement.KEYPAD_TAB_PAY_BUTTON;
                case 15:
                    return Placement.KEYPAD_TAB_TAP_TO_PAY_BUTTON;
                case 16:
                    return Placement.KEYPAD_TAB_REQUEST_BUTTON;
                case 17:
                    return Placement.ACCOUNT_SETTINGS_CASHTAG_DROPDOWN;
                case 18:
                    return Placement.KEYPAD_TAB_POOL_BUTTON;
                case 19:
                    return Placement.CARD_HOME_DESIGN_UPSELL;
                case 20:
                    return Placement.DISCOVER_HERO_SECTION;
                case 21:
                    return Placement.MONEYBOT_CHAT;
                case 22:
                    return Placement.MANUAL_SAVINGS_CASH_IN_SUCCESS;
                case 23:
                    return Placement.MANUAL_CASH_IN_SUCCESS;
                case 24:
                    return Placement.MANUAL_CASH_IN_FAILURE;
                case 25:
                    return Placement.CASH_CARD_TRANSACTION_FAILURE_RECEIPT;
                case 26:
                    return Placement.ATM_WITHDRAWAL_SUCCESS_RECEIPT;
                case 27:
                    return Placement.PAPER_MONEY_DEPOSIT_SUCCESS_RECEIPT;
                case 28:
                    return Placement.SAVINGS_INTEREST_PAYMENT_SUCCESS_RECEIPT;
                case 29:
                    return Placement.FAMILY_APPLET;
                case 30:
                    return Placement.SPONSOR_APPROVAL_FLOW;
                case 31:
                    return Placement.SPONSOR_ALLOWANCES_COMPLETION_FLOW;
                case 32:
                    return Placement.SEND_P2P_FIAT_SUCCESS;
                case 33:
                    return Placement.MONEYBOT_SAVED_TO_MEMORY_LABEL;
                case 34:
                    return Placement.KEYPAD_TAB_QR_BUTTON;
                case 35:
                    return Placement.MONEY_TAB;
                case 36:
                    return Placement.CARD_APPLET;
                case 37:
                    return Placement.PAYMENT_PAD_TAB;
                case 38:
                    return Placement.INVESTING_APPLET;
                case 39:
                    return Placement.ACTIVITY_TAB;
                case 40:
                    return Placement.BITCOIN_APPLET;
                case 41:
                    return Placement.PROFILE_SCREEN;
                case 42:
                    return Placement.KEYPAD_TAB_NEARBY_BUTTON;
                case 43:
                    return Placement.P2P_SUCCESS_RECEIPT;
                case 44:
                    return Placement.REQUEST_P2P_FIAT_SUCCESS;
                default:
                    return null;
            }
        }

        public static Path removeBase(Path path, Path path2) {
            path.getClass();
            path2.getClass();
            return ResourceFileSystem.ROOT.resolve(StringsKt__StringsJVMKt.replace(StringsKt.removePrefix(path2.bytes.utf8(), path.bytes.utf8()), '\\', '/', false));
        }

        public static ItemType fromValue(int i) {
            switch (i) {
                case 0:
                    return ItemType.ITEM_TYPE_DO_NOT_USE;
                case 1:
                    return ItemType.TESTING;
                case 2:
                    return ItemType.ACTIVITY;
                case 3:
                    return ItemType.PROFILE_PENDING_REFERRAL;
                case 4:
                    return ItemType.PROFILE_IDENTITY_HUB;
                case 5:
                    return ItemType.PROFILE_LIMITS;
                case 6:
                    return ItemType.PROFILE_PERSONAL_INFO;
                case 7:
                    return ItemType.PROFILE_SUPPORT_CHAT;
                case 8:
                    return ItemType.PROFILE_LINKED_INSTRUMENTS;
                case 9:
                    return ItemType.MARKETING_MESSAGES;
                default:
                    return null;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetAccountSettingsResponse.SettingType m4351fromValue(int i) {
            switch (i) {
                case 1:
                    return GetAccountSettingsResponse.SettingType.SECURITY;
                case 2:
                    return GetAccountSettingsResponse.SettingType.NOTIFICATION;
                case 3:
                    return GetAccountSettingsResponse.SettingType.PERSONAL;
                case 4:
                    return GetAccountSettingsResponse.SettingType.ACCOUNT_CREATION;
                case 5:
                    return GetAccountSettingsResponse.SettingType.FAMILY;
                case 6:
                    return GetAccountSettingsResponse.SettingType.ACCOUNT_DOWNGRADE;
                case 7:
                    return GetAccountSettingsResponse.SettingType.ACCOUNT_UPGRADE;
                case 8:
                default:
                    return null;
                case 9:
                    return GetAccountSettingsResponse.SettingType.ACCOUNT_LINKING;
                case 10:
                    return GetAccountSettingsResponse.SettingType.BANK_LINKING;
                case 11:
                    return GetAccountSettingsResponse.SettingType.FAVORITES;
                case 12:
                    return GetAccountSettingsResponse.SettingType.THEME;
                case 13:
                    return GetAccountSettingsResponse.SettingType.PROMOTIONS;
                case 14:
                    return GetAccountSettingsResponse.SettingType.SHOPPING;
                case 15:
                    return GetAccountSettingsResponse.SettingType.SECURITY_HUB;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static VerifyIdentityResponse.Status m4356fromValue(int i) {
            if (i == 0) {
                return VerifyIdentityResponse.Status.INVALID;
            }
            if (i == 1) {
                return VerifyIdentityResponse.Status.SUCCESS;
            }
            if (i == 3) {
                return VerifyIdentityResponse.Status.CONCURRENT_MODIFICATION;
            }
            if (i == 4) {
                return VerifyIdentityResponse.Status.INVALID_IDENTITY;
            }
            if (i != 5) {
                return null;
            }
            return VerifyIdentityResponse.Status.FAILURE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static RegisterEmailResponse.Status m4355fromValue(int i) {
            if (i == 0) {
                return RegisterEmailResponse.Status.INVALID;
            }
            if (i == 1) {
                return RegisterEmailResponse.Status.SUCCESS;
            }
            if (i == 3) {
                return RegisterEmailResponse.Status.INVALID_EMAIL_ADDRESS;
            }
            if (i == 4) {
                return RegisterEmailResponse.Status.TOO_MANY_REQUESTS;
            }
            if (i == 5) {
                return RegisterEmailResponse.Status.DUPLICATE_EMAIL_ADDRESS;
            }
            if (i == 6) {
                return RegisterEmailResponse.Status.CUSTOMER_DOES_NOT_EXIST;
            }
            if (i != 7) {
                return null;
            }
            return RegisterEmailResponse.Status.INVALID_ENROLLMENT_TOKEN;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static SyncEntityType m4357fromValue(int i) {
            switch (i) {
                case 0:
                    return SyncEntityType.DO_NOT_USE_SYNC_ENTITY_TYPE;
                case 1:
                    return SyncEntityType.PAYMENT;
                case 2:
                    return SyncEntityType.CUSTOMER;
                case 3:
                    return SyncEntityType.TRANSFER;
                case 4:
                    return SyncEntityType.TRANSACTION;
                case 5:
                    return SyncEntityType.MERCHANT;
                case 6:
                case 8:
                case 15:
                case 28:
                case 30:
                default:
                    return null;
                case 7:
                    return SyncEntityType.LOYALTY_ACCOUNT;
                case 9:
                    return SyncEntityType.REWARD_SELECTION;
                case 10:
                    return SyncEntityType.LOYALTY_PROGRAM;
                case 11:
                    return SyncEntityType.INVESTMENT_HOLDING;
                case 12:
                    return SyncEntityType.INVESTMENT_ENTITY;
                case 13:
                    return SyncEntityType.RECEIPT_ENTITY;
                case 14:
                    return SyncEntityType.SYNC_VALUE;
                case 16:
                    return SyncEntityType.CREDIT_LINE;
                case 17:
                    return SyncEntityType.LOAN;
                case 18:
                    return SyncEntityType.LOAN_TRANSACTION;
                case 19:
                    return SyncEntityType.LOAN_ACTIVITY;
                case 20:
                    return SyncEntityType.INVITATION;
                case 21:
                    return SyncEntityType.RECURRING_PREFERENCES;
                case 22:
                    return SyncEntityType.INVESTMENT_CATEGORY;
                case 23:
                    return SyncEntityType.INVESTMENT_FILTER_GROUP;
                case 24:
                    return SyncEntityType.INVESTMENT_ENTITY_RANKING;
                case 25:
                    return SyncEntityType.INVESTMENT_INCENTIVE;
                case 26:
                    return SyncEntityType.CHECK_DEPOSIT_RECEIPT_ENTITY;
                case 27:
                    return SyncEntityType.INVEST_DEFAULT_NOTIFICATION_SETTINGS;
                case 29:
                    return SyncEntityType.CASH_HOUSE_SCREEN;
                case 31:
                    return SyncEntityType.SPONSORED_ACCOUNT;
                case 32:
                    return SyncEntityType.DOCUMENT_CATEGORY_ENTITY;
                case 33:
                    return SyncEntityType.DOCUMENT_ENTITY;
                case 34:
                    return SyncEntityType.BUSINESS_GRANT;
                case 35:
                    return SyncEntityType.GIFT_CARD;
                case 36:
                    return SyncEntityType.NEW_DEVICE_LOGIN;
                case 37:
                    return SyncEntityType.CRYPTO_PAYROLL_PREFERENCE;
                case 38:
                    return SyncEntityType.ACCOUNT_STATEMENT;
                case 39:
                    return SyncEntityType.GROUP;
                case 40:
                    return SyncEntityType.GROUP_EXPENSE;
                case 41:
                    return SyncEntityType.INVEST_DEFAULT_DIVIDEND_SETTING;
                case 42:
                    return SyncEntityType.COUPON;
                case 43:
                    return SyncEntityType.REACTIONS;
                case 44:
                    return SyncEntityType.SPONSORSHIP_FEATURE_INVITATION;
            }
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static ConfirmPasscodeResponse.Status m4353fromValue(int i) {
            if (i == 0) {
                return ConfirmPasscodeResponse.Status.INVALID;
            }
            if (i == 1) {
                return ConfirmPasscodeResponse.Status.SUCCESS;
            }
            if (i == 3) {
                return ConfirmPasscodeResponse.Status.CONCURRENT_MODIFICATION;
            }
            if (i == 4) {
                return ConfirmPasscodeResponse.Status.INVALID_PASSCODE;
            }
            if (i == 5) {
                return ConfirmPasscodeResponse.Status.TOO_MANY_ATTEMPTS;
            }
            if (i == 6) {
                return ConfirmPasscodeResponse.Status.CARD_BLOCKED;
            }
            if (i != 7) {
                return null;
            }
            return ConfirmPasscodeResponse.Status.FAILURE;
        }

        /* renamed from: fromValue, reason: collision with other method in class */
        public static GetUnredactedIssuedCardResponse$Status m4354fromValue(int i) {
            if (i == 0) {
                return GetUnredactedIssuedCardResponse$Status.INVALID;
            }
            if (i == 1) {
                return GetUnredactedIssuedCardResponse$Status.SUCCESS;
            }
            if (i == 2) {
                return GetUnredactedIssuedCardResponse$Status.INVALID_PASSCODE;
            }
            if (i == 3) {
                return GetUnredactedIssuedCardResponse$Status.TOO_MANY_ATTEMPTS;
            }
            if (i == 4) {
                return GetUnredactedIssuedCardResponse$Status.CONCURRENT_MODIFICATION;
            }
            if (i != 5) {
                return null;
            }
            return GetUnredactedIssuedCardResponse$Status.FAILURE;
        }
    }
}
