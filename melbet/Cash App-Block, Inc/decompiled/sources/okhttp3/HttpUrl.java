package okhttp3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.notifications.channels.RealNotificationChannelMigrationManager;
import com.squareup.cash.storage.ContextForwardingFileSystem;
import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import com.squareup.preferences.IntPreference;
import com.squareup.preferences.MoshiPreference;
import com.squareup.preferences.StringPreference;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.internal.ProgressionUtilKt;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import okio.Path;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final class HttpUrl {
    public final String fragment;
    public final String host;
    public final String password;
    public final ArrayList pathSegments;
    public final int port;
    public final List queryNamesAndValues;
    public final String scheme;
    public final String url;
    public final String username;

    public HttpUrl(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = arrayList;
        this.queryNamesAndValues = arrayList2;
        this.fragment = str5;
        this.url = str6;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return str.substring(StringsKt.indexOf$default((CharSequence) str, ':', length, false, 4) + 1, StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6));
    }

    public final String encodedPath() {
        int length = this.scheme.length() + 3;
        String str = this.url;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4);
        return str.substring(indexOf$default, _UtilCommonKt.delimiterOffset(str, indexOf$default, str.length(), "?#"));
    }

    public final ArrayList encodedPathSegments() {
        int length = this.scheme.length() + 3;
        String str = this.url;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '/', length, false, 4);
        int delimiterOffset = _UtilCommonKt.delimiterOffset(str, indexOf$default, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < delimiterOffset) {
            int i = indexOf$default + 1;
            int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str, '/', i, delimiterOffset);
            arrayList.add(str.substring(i, delimiterOffset2));
            indexOf$default = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        String str = this.url;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6) + 1;
        return str.substring(indexOf$default, _UtilCommonKt.delimiterOffset(str, '#', indexOf$default, str.length()));
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        return str.substring(length, _UtilCommonKt.delimiterOffset(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && ((HttpUrl) obj).url.equals(this.url);
    }

    public final int hashCode() {
        return this.url.hashCode();
    }

    public final boolean isHttps() {
        return Intrinsics.areEqual(this.scheme, "https");
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        ArrayList arrayList = (ArrayList) builder.encodedPathSegments;
        String str = this.scheme;
        builder.scheme = str;
        builder.encodedUsername = encodedUsername();
        builder.encodedPassword = encodedPassword();
        builder.host = this.host;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.port;
        builder.port = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(encodedPathSegments());
        String encodedQuery = encodedQuery();
        String str2 = null;
        builder.encodedQueryNamesAndValues = encodedQuery != null ? Builder.toQueryNamesAndValues(_UrlKt.canonicalize$default(0, 0, 83, encodedQuery, " \"'<>#", true)) : null;
        if (this.fragment != null) {
            String str3 = this.url;
            str2 = str3.substring(StringsKt.indexOf$default((CharSequence) str3, '#', 0, false, 6) + 1);
        }
        builder.encodedFragment = str2;
        return builder;
    }

    public final String queryParameter(String str) {
        str.getClass();
        List list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, list.size()));
        int i = step.first;
        int i2 = step.last;
        int i3 = step.step;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final Set queryParameterNames() {
        List list = this.queryNamesAndValues;
        if (list == null) {
            return EmptySet.INSTANCE;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(list.size() / 2, 1.0f);
        IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, list.size()));
        int i = step.first;
        int i2 = step.last;
        int i3 = step.step;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                Object obj = list.get(i);
                obj.getClass();
                linkedHashSet.add(obj);
                if (i == i2) {
                    break;
                }
                i += i3;
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    public final String redact() {
        Builder builder;
        try {
            builder = new Builder();
            builder.parse$okhttp(this, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.encodedUsername = _UrlKt.canonicalize$default(0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, "", " \"':;<=>@[]^`{}|/\\?#", false);
        builder.encodedPassword = _UrlKt.canonicalize$default(0, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, "", " \"':;<=>@[]^`{}|/\\?#", false);
        return builder.build().url;
    }

    public final HttpUrl resolve(String str) {
        Builder builder;
        str.getClass();
        try {
            builder = new Builder();
            builder.parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        if (builder != null) {
            return builder.build();
        }
        return null;
    }

    public final String toString() {
        return this.url;
    }

    public final URI uri() {
        Builder newBuilder = newBuilder();
        ArrayList arrayList = (ArrayList) newBuilder.encodedPathSegments;
        String str = (String) newBuilder.host;
        newBuilder.host = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, _UrlKt.canonicalize$default(0, 0, 99, (String) arrayList.get(i), "[]", true));
        }
        ArrayList arrayList2 = (ArrayList) newBuilder.encodedQueryNamesAndValues;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? _UrlKt.canonicalize$default(0, 0, 67, str2, "\\^`{|}", true) : null);
            }
        }
        String str3 = (String) newBuilder.encodedFragment;
        newBuilder.encodedFragment = str3 != null ? _UrlKt.canonicalize$default(0, 0, 35, str3, " \"#<>\\^`{|}", true) : null;
        String builder = newBuilder.toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(builder, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                return null;
            }
        }
    }

    public final class Builder {
        public final /* synthetic */ int $r8$classId;
        public Object encodedFragment;
        public Object encodedPassword;
        public final Object encodedPathSegments;
        public Object encodedQueryNamesAndValues;
        public Object encodedUsername;
        public Object host;
        public int port;
        public Object scheme;

        public Builder(Context context, SharedPreferences sharedPreferences, IntPreference intPreference, WireAdapter wireAdapter, RealNotificationChannelMigrationManager realNotificationChannelMigrationManager, StringPreference stringPreference, int i, Storage storage) {
            this.$r8$classId = 1;
            context.getClass();
            sharedPreferences.getClass();
            intPreference.getClass();
            stringPreference.getClass();
            storage.getClass();
            this.scheme = context;
            this.encodedUsername = sharedPreferences;
            this.encodedPassword = intPreference;
            this.host = wireAdapter;
            this.encodedFragment = realNotificationChannelMigrationManager;
            this.encodedPathSegments = stringPreference;
            this.port = i;
            this.encodedQueryNamesAndValues = storage;
        }

        public static ArrayList toQueryNamesAndValues(String str) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', i, false, 4);
                if (indexOf$default == -1) {
                    indexOf$default = str.length();
                }
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4);
                if (indexOf$default2 == -1 || indexOf$default2 > indexOf$default) {
                    arrayList.add(str.substring(i, indexOf$default));
                    arrayList.add(null);
                } else {
                    arrayList.add(str.substring(i, indexOf$default2));
                    arrayList.add(str.substring(indexOf$default2 + 1, indexOf$default));
                }
                i = indexOf$default + 1;
            }
            return arrayList;
        }

        public void addEncodedQueryParameter(String str, String str2) {
            str.getClass();
            if (((ArrayList) this.encodedQueryNamesAndValues) == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) this.encodedQueryNamesAndValues;
            arrayList.getClass();
            arrayList.add(_UrlKt.canonicalize$default(0, 0, 83, str, " \"'<>#&=", true));
            ArrayList arrayList2 = (ArrayList) this.encodedQueryNamesAndValues;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? _UrlKt.canonicalize$default(0, 0, 83, str2, " \"'<>#&=", true) : null);
        }

        public void addPathSegment(String str) {
            str.getClass();
            push(str, 0, str.length(), false, false);
        }

        public void addPathSegments(String str, boolean z) {
            boolean z2;
            Builder builder;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(str, i, str.length(), "/\\");
                if (delimiterOffset < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    builder = this;
                } else {
                    z2 = false;
                    builder = this;
                    str2 = str;
                    z3 = z;
                }
                builder.push(str2, i, delimiterOffset, z2, z3);
                i = delimiterOffset + 1;
                if (i > str2.length()) {
                    return;
                }
                this = builder;
                str = str2;
                z = z3;
            }
        }

        public void addQueryParameter(String str, String str2) {
            str.getClass();
            if (((ArrayList) this.encodedQueryNamesAndValues) == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) this.encodedQueryNamesAndValues;
            arrayList.getClass();
            arrayList.add(_UrlKt.canonicalize$default(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false));
            ArrayList arrayList2 = (ArrayList) this.encodedQueryNamesAndValues;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? _UrlKt.canonicalize$default(0, 0, 91, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false) : null);
        }

        public HttpUrl build() {
            ArrayList arrayList;
            String str = (String) this.scheme;
            if (str == null) {
                a$$ExternalSyntheticBUOutline0.m$1("scheme == null");
                return null;
            }
            String percentDecode$default = _UrlKt.percentDecode$default(0, 0, 7, (String) this.encodedUsername);
            String percentDecode$default2 = _UrlKt.percentDecode$default(0, 0, 7, (String) this.encodedPassword);
            String str2 = (String) this.host;
            if (str2 == null) {
                a$$ExternalSyntheticBUOutline0.m$1("host == null");
                return null;
            }
            int effectivePort = effectivePort();
            ArrayList arrayList2 = (ArrayList) this.encodedPathSegments;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(_UrlKt.percentDecode$default(0, 0, 7, (String) it.next()));
            }
            ArrayList<String> arrayList4 = (ArrayList) this.encodedQueryNamesAndValues;
            if (arrayList4 != null) {
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                for (String str3 : arrayList4) {
                    arrayList5.add(str3 != null ? _UrlKt.percentDecode$default(0, 0, 3, str3) : null);
                }
                arrayList = arrayList5;
            } else {
                arrayList = null;
            }
            String str4 = (String) this.encodedFragment;
            return new HttpUrl(str, percentDecode$default, percentDecode$default2, str2, effectivePort, arrayList3, arrayList, str4 != null ? _UrlKt.percentDecode$default(0, 0, 7, str4) : null, toString());
        }

        public synchronized void checkUpdate() {
            File externalCacheDir;
            if (!((IntPreference) this.encodedPassword).preferences.contains("version-code") && !((SharedPreferences) this.encodedUsername).contains("app-token")) {
                ((IntPreference) this.encodedPassword).preferences.edit().putInt("version-code", this.port).apply();
                return;
            }
            int i = ((IntPreference) this.encodedPassword).preferences.getInt("version-code", 0);
            if (i < this.port) {
                if (i < 20000) {
                    Timber.Forest.d("Running v2 update", new Object[0]);
                    ((SharedPreferences) this.encodedUsername).edit().remove("app-token").remove("show-tutorial").remove("email-addresses").apply();
                }
                if (i < 2020000) {
                    SharedPreferences sharedPreferences = (SharedPreferences) this.encodedUsername;
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.remove("install-id");
                    if (sharedPreferences.getBoolean("reauthenticate", false)) {
                        edit.putBoolean("onboarded", false);
                    }
                    edit.remove("reauthenticate");
                    edit.apply();
                }
                if (i < 2040000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("invitation-config-enabled").remove("invitation-config-message").remove("invitation-config-bounty-amount").remove("invitation-config-welcome-amount").remove("invitation-config-header").apply();
                }
                if (i < 2060001) {
                    new File(((Context) this.scheme).getFilesDir(), "payment_tokens.txt").delete();
                    ((StringPreference) this.encodedPathSegments).delete();
                }
                if (i < 2080000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("show-whats-new").apply();
                }
                if (i < 2130000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("app-config-last-sync-time").apply();
                }
                if (i < 2140000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("consecutive-success").remove("rated").remove("never-prompt-rating").remove("last-rating-prompt").remove("last-invite-prompt").apply();
                }
                if (i < 2370002) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("use-tabbed-user-interface").apply();
                }
                if (i < 2460000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("search-preference").apply();
                }
                if (i < 2550000 && (externalCacheDir = ((Context) this.scheme).getExternalCacheDir()) != null) {
                    FilesKt__UtilsKt.deleteRecursively(externalCacheDir);
                }
                if (i < 2580000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("bounce-slider-bottom-sheet").apply();
                }
                if (i < 2500000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("bitcoin-first-time").apply();
                }
                if (i < 3040000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("has-responded-to-card-wiggle").apply();
                }
                if (i < 3050000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("last_elected_investing_toggle").apply();
                }
                if (i < 3520000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("bitcoin-coach-marks-viewed").apply();
                }
                if (i < 3690000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("use_fake_block").apply();
                }
                if (i < 4070000) {
                    ((Context) this.scheme).deleteSharedPreferences("CashTrialPrefs");
                }
                if (i < 4150000) {
                    ContextForwardingFileSystem contextForwardingFileSystem = ((RealStorage) ((Storage) this.encodedQueryNamesAndValues)).files;
                    String str = Path.DIRECTORY_SEPARATOR;
                    Path path = Path.Companion.get("/paymentHistory.js", false);
                    contextForwardingFileSystem.getClass();
                    contextForwardingFileSystem.delete(path, false);
                }
                if (i < 4680000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("last-updated-international-payments-timestamp").remove("has-seen-international-payments-education").apply();
                }
                if (i < 4910000) {
                    ((SharedPreferences) this.encodedUsername).edit().remove("favorites-viewed").apply();
                }
                if (i < 4940000) {
                    ContextForwardingFileSystem contextForwardingFileSystem2 = ((RealStorage) ((Storage) this.encodedQueryNamesAndValues)).cache;
                    String str2 = Path.DIRECTORY_SEPARATOR;
                    Path path2 = Path.Companion.get("/paymentHistory.js", false);
                    contextForwardingFileSystem2.getClass();
                    contextForwardingFileSystem2.delete(path2, false);
                }
                ((IntPreference) this.encodedPassword).preferences.edit().putInt("version-code", this.port).apply();
                ((MoshiPreference) ((WireAdapter) this.host).adapter).delete();
                ((RealNotificationChannelMigrationManager) this.encodedFragment).removeUnusedChannels();
            }
        }

        public int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            String str = (String) this.scheme;
            str.getClass();
            if (Intrinsics.areEqual(str, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(str, "https") ? 443 : -1;
        }

        public void encodedPath(String str) {
            str.getClass();
            if (StringsKt__StringsJVMKt.startsWith(str, "/", false)) {
                resolvePath(0, str.length(), str);
            } else {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) "unexpected encodedPath: ".concat(str));
            }
        }

        public void host(String str) {
            str.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(0, 0, 7, str));
            if (canonicalHost != null) {
                this.host = canonicalHost;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("unexpected host: ".concat(str));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:167:0x0079, code lost:
        
            if (r13 == ':') goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x021f, code lost:
        
            if (r3 < 65536) goto L123;
         */
        /* JADX WARN: Removed duplicated region for block: B:104:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x029d  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:123:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01dc  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void parse$okhttp(HttpUrl httpUrl, String str) {
            int i;
            int i2;
            int i3;
            char c;
            char c2;
            char c3;
            char c4;
            int i4;
            int delimiterOffset;
            char charAt;
            char c5;
            char c6;
            int i5;
            int i6;
            int i7;
            int i8;
            char c7;
            char c8;
            int i9;
            char charAt2;
            String str2 = str;
            ArrayList arrayList = (ArrayList) this.encodedPathSegments;
            str2.getClass();
            byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
            int indexOfFirstNonAsciiWhitespace = _UtilCommonKt.indexOfFirstNonAsciiWhitespace(0, str2.length(), str2);
            int indexOfLastNonAsciiWhitespace = _UtilCommonKt.indexOfLastNonAsciiWhitespace(indexOfFirstNonAsciiWhitespace, str2.length(), str2);
            int i10 = -1;
            if (indexOfLastNonAsciiWhitespace - indexOfFirstNonAsciiWhitespace >= 2) {
                char charAt3 = str2.charAt(indexOfFirstNonAsciiWhitespace);
                if ((Intrinsics.compare((int) charAt3, 97) >= 0 && Intrinsics.compare((int) charAt3, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) <= 0) || (Intrinsics.compare((int) charAt3, 65) >= 0 && Intrinsics.compare((int) charAt3, 90) <= 0)) {
                    i = indexOfFirstNonAsciiWhitespace + 1;
                    while (true) {
                        if (i >= indexOfLastNonAsciiWhitespace) {
                            break;
                        }
                        char charAt4 = str2.charAt(i);
                        if (('a' <= charAt4 && charAt4 < '{') || (('A' <= charAt4 && charAt4 < '[') || (('0' <= charAt4 && charAt4 < ':') || charAt4 == '+' || charAt4 == '-' || charAt4 == '.'))) {
                            i++;
                        }
                    }
                    if (i == -1) {
                        if (StringsKt__StringsJVMKt.startsWith(str2, "https:", indexOfFirstNonAsciiWhitespace, true)) {
                            this.scheme = "https";
                            indexOfFirstNonAsciiWhitespace += 6;
                        } else {
                            if (!StringsKt__StringsJVMKt.startsWith(str2, "http:", indexOfFirstNonAsciiWhitespace, true)) {
                                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, i) + '\'');
                            }
                            this.scheme = "http";
                            indexOfFirstNonAsciiWhitespace += 5;
                        }
                    } else {
                        if (httpUrl == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str2.length() > 6 ? StringsKt___StringsKt.take(6, str2).concat("...") : str2));
                            return;
                        }
                        this.scheme = httpUrl.scheme;
                    }
                    i2 = indexOfFirstNonAsciiWhitespace;
                    i3 = 0;
                    while (true) {
                        c = '\\';
                        c2 = '/';
                        if (i2 >= indexOfLastNonAsciiWhitespace || !((charAt2 = str2.charAt(i2)) == '/' || charAt2 == '\\')) {
                            break;
                        }
                        i3++;
                        i2++;
                    }
                    c3 = '?';
                    c4 = '#';
                    if (i3 < 2 || httpUrl == null || !Intrinsics.areEqual(httpUrl.scheme, (String) this.scheme)) {
                        i4 = indexOfFirstNonAsciiWhitespace + i3;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            delimiterOffset = _UtilCommonKt.delimiterOffset(str2, i4, indexOfLastNonAsciiWhitespace, "@/\\?#");
                            charAt = delimiterOffset == indexOfLastNonAsciiWhitespace ? str2.charAt(delimiterOffset) : (char) 65535;
                            if (charAt == 65535 || charAt == c4 || charAt == c2 || charAt == c || charAt == c3) {
                                break;
                            }
                            if (charAt == '@') {
                                if (z2) {
                                    c7 = c3;
                                    c8 = c4;
                                    i9 = delimiterOffset;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append((String) this.encodedPassword);
                                    sb.append("%40");
                                    str2 = str;
                                    sb.append(_UrlKt.canonicalize$default(i4, i9, 112, str2, " \"':;<=>@[]^`{}|/\\?#", true));
                                    this.encodedPassword = sb.toString();
                                } else {
                                    int delimiterOffset2 = _UtilCommonKt.delimiterOffset(str2, ':', i4, delimiterOffset);
                                    c8 = c4;
                                    c7 = c3;
                                    String canonicalize$default = _UrlKt.canonicalize$default(i4, delimiterOffset2, 112, str2, " \"':;<=>@[]^`{}|/\\?#", true);
                                    if (z) {
                                        canonicalize$default = Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(), (String) this.encodedUsername, "%40", canonicalize$default);
                                    }
                                    this.encodedUsername = canonicalize$default;
                                    if (delimiterOffset2 != delimiterOffset) {
                                        i9 = delimiterOffset;
                                        this.encodedPassword = _UrlKt.canonicalize$default(delimiterOffset2 + 1, i9, 112, str, " \"':;<=>@[]^`{}|/\\?#", true);
                                        z2 = true;
                                    } else {
                                        i9 = delimiterOffset;
                                    }
                                    str2 = str;
                                    z = true;
                                }
                                i4 = i9 + 1;
                                c3 = c7;
                                c4 = c8;
                                c2 = '/';
                                c = '\\';
                            }
                        }
                        int i11 = i4;
                        c5 = c3;
                        c6 = c4;
                        i5 = i11;
                        while (true) {
                            if (i5 < delimiterOffset) {
                                char charAt5 = str2.charAt(i5);
                                if (charAt5 == ':') {
                                    i6 = i5;
                                    break;
                                }
                                if (charAt5 == '[') {
                                    do {
                                        i5++;
                                        if (i5 < delimiterOffset) {
                                        }
                                    } while (str2.charAt(i5) != ']');
                                }
                                i5++;
                            } else {
                                i6 = delimiterOffset;
                                break;
                            }
                        }
                        i7 = i6 + 1;
                        if (i7 >= delimiterOffset) {
                            this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(i11, i6, 4, str2));
                            try {
                                i8 = Integer.parseInt(_UrlKt.canonicalize$default(i7, delimiterOffset, 120, str2, "", false));
                                if (1 <= i8) {
                                }
                            } catch (NumberFormatException unused) {
                            }
                            i8 = -1;
                            this.port = i8;
                            if (i8 == -1) {
                                Path$$ExternalSyntheticBUOutline0.m$1("Invalid URL port: \"", 34, str2.substring(i7, delimiterOffset));
                                return;
                            }
                        } else {
                            this.host = _HostnamesCommonKt.toCanonicalHost(_UrlKt.percentDecode$default(i11, i6, 4, str2));
                            String str3 = (String) this.scheme;
                            str3.getClass();
                            if (str3.equals("http")) {
                                i10 = 80;
                            } else if (str3.equals("https")) {
                                i10 = 443;
                            }
                            this.port = i10;
                        }
                        if (((String) this.host) != null) {
                            Path$$ExternalSyntheticBUOutline0.m$1("Invalid URL host: \"", 34, str2.substring(i11, i6));
                            return;
                        }
                        indexOfFirstNonAsciiWhitespace = delimiterOffset;
                    } else {
                        this.encodedUsername = httpUrl.encodedUsername();
                        this.encodedPassword = httpUrl.encodedPassword();
                        this.host = httpUrl.host;
                        this.port = httpUrl.port;
                        arrayList.clear();
                        arrayList.addAll(httpUrl.encodedPathSegments());
                        if (indexOfFirstNonAsciiWhitespace == indexOfLastNonAsciiWhitespace || str2.charAt(indexOfFirstNonAsciiWhitespace) == '#') {
                            String encodedQuery = httpUrl.encodedQuery();
                            this.encodedQueryNamesAndValues = encodedQuery != null ? toQueryNamesAndValues(_UrlKt.canonicalize$default(0, 0, 83, encodedQuery, " \"'<>#", true)) : null;
                        }
                        c5 = '?';
                        c6 = '#';
                    }
                    int delimiterOffset3 = _UtilCommonKt.delimiterOffset(str2, indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace, "?#");
                    resolvePath(indexOfFirstNonAsciiWhitespace, delimiterOffset3, str2);
                    if (delimiterOffset3 < indexOfLastNonAsciiWhitespace && str2.charAt(delimiterOffset3) == c5) {
                        int delimiterOffset4 = _UtilCommonKt.delimiterOffset(str2, c6, delimiterOffset3, indexOfLastNonAsciiWhitespace);
                        this.encodedQueryNamesAndValues = toQueryNamesAndValues(_UrlKt.canonicalize$default(delimiterOffset3 + 1, delimiterOffset4, 80, str2, " \"'<>#", true));
                        delimiterOffset3 = delimiterOffset4;
                    }
                    if (delimiterOffset3 >= indexOfLastNonAsciiWhitespace || str2.charAt(delimiterOffset3) != c6) {
                        return;
                    }
                    this.encodedFragment = _UrlKt.canonicalize$default(delimiterOffset3 + 1, indexOfLastNonAsciiWhitespace, 48, str2, "", true);
                    return;
                }
            }
            i = -1;
            if (i == -1) {
            }
            i2 = indexOfFirstNonAsciiWhitespace;
            i3 = 0;
            while (true) {
                c = '\\';
                c2 = '/';
                if (i2 >= indexOfLastNonAsciiWhitespace) {
                    break;
                } else {
                    break;
                }
                i3++;
                i2++;
            }
            c3 = '?';
            c4 = '#';
            if (i3 < 2) {
            }
            i4 = indexOfFirstNonAsciiWhitespace + i3;
            boolean z3 = false;
            boolean z22 = false;
            while (true) {
                delimiterOffset = _UtilCommonKt.delimiterOffset(str2, i4, indexOfLastNonAsciiWhitespace, "@/\\?#");
                if (delimiterOffset == indexOfLastNonAsciiWhitespace) {
                }
                if (charAt == 65535) {
                    break;
                } else {
                    break;
                }
            }
            int i112 = i4;
            c5 = c3;
            c6 = c4;
            i5 = i112;
            while (true) {
                if (i5 < delimiterOffset) {
                }
                i5++;
            }
            i7 = i6 + 1;
            if (i7 >= delimiterOffset) {
            }
            if (((String) this.host) != null) {
            }
        }

        public void push(String str, int i, int i2, boolean z, boolean z2) {
            ArrayList arrayList = (ArrayList) this.encodedPathSegments;
            String canonicalize$default = _UrlKt.canonicalize$default(i, i2, 112, str, " \"<>^`{}|/\\?#", z2);
            if (canonicalize$default.equals(".") || canonicalize$default.equalsIgnoreCase("%2e")) {
                return;
            }
            if (canonicalize$default.equals("..") || canonicalize$default.equalsIgnoreCase("%2e.") || canonicalize$default.equalsIgnoreCase(".%2e") || canonicalize$default.equalsIgnoreCase("%2e%2e")) {
                if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                    arrayList.add("");
                    return;
                } else {
                    arrayList.set(arrayList.size() - 1, "");
                    return;
                }
            }
            if (((CharSequence) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList)).length() == 0) {
                arrayList.set(arrayList.size() - 1, canonicalize$default);
            } else {
                arrayList.add(canonicalize$default);
            }
            if (z) {
                arrayList.add("");
            }
        }

        public void removeAllQueryParameters(String str) {
            str.getClass();
            if (((ArrayList) this.encodedQueryNamesAndValues) == null) {
                return;
            }
            String canonicalize$default = _UrlKt.canonicalize$default(0, 0, 91, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false);
            ArrayList arrayList = (ArrayList) this.encodedQueryNamesAndValues;
            arrayList.getClass();
            int size = arrayList.size() - 2;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(size, 0, -2);
            if (progressionLastElement > size) {
                return;
            }
            while (true) {
                ArrayList arrayList2 = (ArrayList) this.encodedQueryNamesAndValues;
                arrayList2.getClass();
                if (canonicalize$default.equals(arrayList2.get(size))) {
                    ArrayList arrayList3 = (ArrayList) this.encodedQueryNamesAndValues;
                    arrayList3.getClass();
                    arrayList3.remove(size + 1);
                    ArrayList arrayList4 = (ArrayList) this.encodedQueryNamesAndValues;
                    arrayList4.getClass();
                    arrayList4.remove(size);
                    ArrayList arrayList5 = (ArrayList) this.encodedQueryNamesAndValues;
                    arrayList5.getClass();
                    if (arrayList5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size == progressionLastElement) {
                    return;
                } else {
                    size -= 2;
                }
            }
        }

        public void resolvePath(int i, int i2, String str) {
            ArrayList arrayList = (ArrayList) this.encodedPathSegments;
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                arrayList.clear();
                arrayList.add("");
                i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int delimiterOffset = _UtilCommonKt.delimiterOffset(str, i3, i2, "/\\");
                boolean z = delimiterOffset < i2;
                Builder builder = this;
                String str2 = str;
                builder.push(str2, i3, delimiterOffset, z, true);
                if (z) {
                    i3 = delimiterOffset + 1;
                    this = builder;
                    str = str2;
                } else {
                    this = builder;
                    str = str2;
                    i3 = delimiterOffset;
                }
            }
        }

        public void scheme(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.scheme = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.scheme = "https";
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("unexpected scheme: ".concat(str));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
        
            if (r1 != r4) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    StringBuilder sb = new StringBuilder();
                    String str = (String) this.scheme;
                    if (str != null) {
                        sb.append(str);
                        sb.append("://");
                    } else {
                        sb.append("//");
                    }
                    if (((String) this.encodedUsername).length() > 0 || ((String) this.encodedPassword).length() > 0) {
                        sb.append((String) this.encodedUsername);
                        if (((String) this.encodedPassword).length() > 0) {
                            sb.append(':');
                            sb.append((String) this.encodedPassword);
                        }
                        sb.append('@');
                    }
                    String str2 = (String) this.host;
                    if (str2 != null) {
                        if (StringsKt.contains((CharSequence) str2, ':', false)) {
                            sb.append('[');
                            sb.append((String) this.host);
                            sb.append(']');
                        } else {
                            sb.append((String) this.host);
                        }
                    }
                    int i = -1;
                    if (this.port != -1 || ((String) this.scheme) != null) {
                        int effectivePort = effectivePort();
                        String str3 = (String) this.scheme;
                        if (str3 != null) {
                            if (str3.equals("http")) {
                                i = 80;
                                break;
                            } else if (str3.equals("https")) {
                                i = 443;
                                break;
                            }
                        }
                        sb.append(':');
                        sb.append(effectivePort);
                    }
                    ArrayList arrayList = (ArrayList) this.encodedPathSegments;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        sb.append('/');
                        sb.append((String) arrayList.get(i2));
                    }
                    if (((ArrayList) this.encodedQueryNamesAndValues) != null) {
                        sb.append('?');
                        ArrayList arrayList2 = (ArrayList) this.encodedQueryNamesAndValues;
                        arrayList2.getClass();
                        Companion.access$toQueryString(sb, arrayList2);
                    }
                    if (((String) this.encodedFragment) != null) {
                        sb.append('#');
                        sb.append((String) this.encodedFragment);
                    }
                    return sb.toString();
                default:
                    return super.toString();
            }
        }

        public Builder() {
            this.$r8$classId = 0;
            this.encodedUsername = "";
            this.encodedPassword = "";
            this.port = -1;
            this.encodedPathSegments = CollectionsKt__CollectionsKt.mutableListOf("");
        }
    }

    public final class Companion implements CookieJar, Dns, TrailersSource {
        public static final Companion NONE = new Companion();

        public static final CipherSuite access$init(Companion companion, String str) {
            CipherSuite cipherSuite = new CipherSuite(str);
            CipherSuite.INSTANCES.put(str, cipherSuite);
            return cipherSuite;
        }

        public static final void access$toQueryString(StringBuilder sb, List list) {
            IntProgression step = RangesKt___RangesKt.step(2, RangesKt___RangesKt.until(0, list.size()));
            int i = step.first;
            int i2 = step.last;
            int i3 = step.step;
            if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
                return;
            }
            while (true) {
                String str = (String) list.get(i);
                String str2 = (String) list.get(i + 1);
                if (i > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (i == i2) {
                    return;
                } else {
                    i += i3;
                }
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static TlsVersion forJavaName(String str) {
            str.getClass();
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return TlsVersion.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return TlsVersion.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return TlsVersion.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return TlsVersion.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return TlsVersion.SSL_3_0;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Unexpected TLS version: ".concat(str));
            return null;
        }

        public static Protocol get(String str) {
            Protocol protocol = Protocol.HTTP_1_0;
            if (str.equals("http/1.0")) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (str.equals("http/1.1")) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (str.equals("h2_prior_knowledge")) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (str.equals("h2")) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (str.equals("spdy/3.1")) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (str.equals("quic")) {
                return protocol6;
            }
            Protocol protocol7 = Protocol.HTTP_3;
            if (StringsKt__StringsJVMKt.startsWith(str, "h3", false)) {
                return protocol7;
            }
            a$$ExternalSyntheticBUOutline0.m$4("Unexpected protocol: ".concat(str));
            return null;
        }

        @Override // okhttp3.CookieJar
        public List loadForRequest(HttpUrl httpUrl) {
            httpUrl.getClass();
            return EmptyList.INSTANCE;
        }

        @Override // okhttp3.Dns
        public List lookup(String str) {
            str.getClass();
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                allByName.getClass();
                return ArraysKt___ArraysKt.toList(allByName);
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException(Recorder$$ExternalSyntheticOutline2.m("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }

        @Override // okhttp3.CookieJar
        public void saveFromResponse(HttpUrl httpUrl, List list) {
            httpUrl.getClass();
        }

        /* renamed from: forJavaName, reason: collision with other method in class */
        public synchronized CipherSuite m4320forJavaName(String str) {
            CipherSuite cipherSuite;
            String concat;
            try {
                str.getClass();
                LinkedHashMap linkedHashMap = CipherSuite.INSTANCES;
                cipherSuite = (CipherSuite) linkedHashMap.get(str);
                if (cipherSuite == null) {
                    if (StringsKt__StringsJVMKt.startsWith(str, "TLS_", false)) {
                        concat = "SSL_".concat(str.substring(4));
                    } else {
                        concat = StringsKt__StringsJVMKt.startsWith(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                    }
                    cipherSuite = (CipherSuite) linkedHashMap.get(concat);
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(str);
                    }
                    linkedHashMap.put(str, cipherSuite);
                }
            } catch (Throwable th) {
                throw th;
            }
            return cipherSuite;
        }

        @Override // okhttp3.TrailersSource
        public Headers get() {
            return Headers.EMPTY;
        }
    }
}
