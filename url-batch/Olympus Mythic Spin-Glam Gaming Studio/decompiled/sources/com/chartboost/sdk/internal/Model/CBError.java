package com.chartboost.sdk.internal.Model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0015\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "b", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "getType", "()Lcom/chartboost/sdk/internal/Model/CBError$Type;", "type", "", "c", "Ljava/lang/String;", "getErrorDesc", "()Ljava/lang/String;", "errorDesc", "Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "getImpressionError", "()Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "impressionError", "<init>", "(Lcom/chartboost/sdk/internal/Model/CBError$Type;Ljava/lang/String;)V", "Click", "Impression", "Internal", "Type", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CBError extends Exception {

    /* renamed from: b, reason: from kotlin metadata */
    public final Type type;

    /* renamed from: c, reason: from kotlin metadata */
    public final String errorDesc;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Click;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "URI_INVALID", "URI_UNRECOGNIZED", "LOAD_NOT_FINISHED", "INTERNAL", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Click implements Type {
        public static final /* synthetic */ Click[] b;
        public static final /* synthetic */ EnumEntries c;
        public static final Click URI_INVALID = new Click("URI_INVALID", 0);
        public static final Click URI_UNRECOGNIZED = new Click("URI_UNRECOGNIZED", 1);
        public static final Click LOAD_NOT_FINISHED = new Click("LOAD_NOT_FINISHED", 2);
        public static final Click INTERNAL = new Click("INTERNAL", 3);

        static {
            Click[] a = a();
            b = a;
            c = EnumEntriesKt.enumEntries(a);
        }

        public Click(String str, int i) {
        }

        public static final /* synthetic */ Click[] a() {
            return new Click[]{URI_INVALID, URI_UNRECOGNIZED, LOAD_NOT_FINISHED, INTERNAL};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return c;
        }

        public static Click valueOf(String str) {
            return (Click) Enum.valueOf(Click.class, str);
        }

        public static Click[] values() {
            return (Click[]) b.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b#\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "INTERNAL", "INTERNET_UNAVAILABLE", "TOO_MANY_CONNECTIONS", "WRONG_ORIENTATION", "FIRST_SESSION_INTERSTITIALS_DISABLED", "NETWORK_FAILURE", "NO_AD_FOUND", "SESSION_NOT_STARTED", "IMPRESSION_ALREADY_VISIBLE", "NO_HOST_ACTIVITY", "USER_CANCELLATION", "INVALID_LOCATION", "VIDEO_UNAVAILABLE", "VIDEO_ID_MISSING", "ERROR_PLAYING_VIDEO", "INVALID_RESPONSE", "ASSETS_DOWNLOAD_FAILURE", "ERROR_CREATING_VIEW", "ERROR_DISPLAYING_VIEW", "INCOMPATIBLE_API_VERSION", "ERROR_LOADING_WEB_VIEW", "ASSET_PREFETCH_IN_PROGRESS", "ACTIVITY_MISSING_IN_MANIFEST", "EMPTY_LOCAL_VIDEO_LIST", "END_POINT_DISABLED", "HARDWARE_ACCELERATION_DISABLED", "PENDING_IMPRESSION_ERROR", "VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION", "ASSET_MISSING", "WEB_VIEW_PAGE_LOAD_TIMEOUT", "WEB_VIEW_CLIENT_RECEIVED_ERROR", "INTERNET_UNAVAILABLE_AT_SHOW", "INTERNET_UNAVAILABLE_AT_CACHE", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Impression implements Type {
        public static final /* synthetic */ Impression[] b;
        public static final /* synthetic */ EnumEntries c;
        public static final Impression INTERNAL = new Impression("INTERNAL", 0);
        public static final Impression INTERNET_UNAVAILABLE = new Impression("INTERNET_UNAVAILABLE", 1);
        public static final Impression TOO_MANY_CONNECTIONS = new Impression("TOO_MANY_CONNECTIONS", 2);
        public static final Impression WRONG_ORIENTATION = new Impression("WRONG_ORIENTATION", 3);
        public static final Impression FIRST_SESSION_INTERSTITIALS_DISABLED = new Impression("FIRST_SESSION_INTERSTITIALS_DISABLED", 4);
        public static final Impression NETWORK_FAILURE = new Impression("NETWORK_FAILURE", 5);
        public static final Impression NO_AD_FOUND = new Impression("NO_AD_FOUND", 6);
        public static final Impression SESSION_NOT_STARTED = new Impression("SESSION_NOT_STARTED", 7);
        public static final Impression IMPRESSION_ALREADY_VISIBLE = new Impression("IMPRESSION_ALREADY_VISIBLE", 8);
        public static final Impression NO_HOST_ACTIVITY = new Impression("NO_HOST_ACTIVITY", 9);
        public static final Impression USER_CANCELLATION = new Impression("USER_CANCELLATION", 10);
        public static final Impression INVALID_LOCATION = new Impression("INVALID_LOCATION", 11);
        public static final Impression VIDEO_UNAVAILABLE = new Impression("VIDEO_UNAVAILABLE", 12);
        public static final Impression VIDEO_ID_MISSING = new Impression("VIDEO_ID_MISSING", 13);
        public static final Impression ERROR_PLAYING_VIDEO = new Impression("ERROR_PLAYING_VIDEO", 14);
        public static final Impression INVALID_RESPONSE = new Impression("INVALID_RESPONSE", 15);
        public static final Impression ASSETS_DOWNLOAD_FAILURE = new Impression("ASSETS_DOWNLOAD_FAILURE", 16);
        public static final Impression ERROR_CREATING_VIEW = new Impression("ERROR_CREATING_VIEW", 17);
        public static final Impression ERROR_DISPLAYING_VIEW = new Impression("ERROR_DISPLAYING_VIEW", 18);
        public static final Impression INCOMPATIBLE_API_VERSION = new Impression("INCOMPATIBLE_API_VERSION", 19);
        public static final Impression ERROR_LOADING_WEB_VIEW = new Impression("ERROR_LOADING_WEB_VIEW", 20);
        public static final Impression ASSET_PREFETCH_IN_PROGRESS = new Impression("ASSET_PREFETCH_IN_PROGRESS", 21);
        public static final Impression ACTIVITY_MISSING_IN_MANIFEST = new Impression("ACTIVITY_MISSING_IN_MANIFEST", 22);
        public static final Impression EMPTY_LOCAL_VIDEO_LIST = new Impression("EMPTY_LOCAL_VIDEO_LIST", 23);
        public static final Impression END_POINT_DISABLED = new Impression("END_POINT_DISABLED", 24);
        public static final Impression HARDWARE_ACCELERATION_DISABLED = new Impression("HARDWARE_ACCELERATION_DISABLED", 25);
        public static final Impression PENDING_IMPRESSION_ERROR = new Impression("PENDING_IMPRESSION_ERROR", 26);
        public static final Impression VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION = new Impression("VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION", 27);
        public static final Impression ASSET_MISSING = new Impression("ASSET_MISSING", 28);
        public static final Impression WEB_VIEW_PAGE_LOAD_TIMEOUT = new Impression("WEB_VIEW_PAGE_LOAD_TIMEOUT", 29);
        public static final Impression WEB_VIEW_CLIENT_RECEIVED_ERROR = new Impression("WEB_VIEW_CLIENT_RECEIVED_ERROR", 30);
        public static final Impression INTERNET_UNAVAILABLE_AT_SHOW = new Impression("INTERNET_UNAVAILABLE_AT_SHOW", 31);
        public static final Impression INTERNET_UNAVAILABLE_AT_CACHE = new Impression("INTERNET_UNAVAILABLE_AT_CACHE", 32);

        static {
            Impression[] a = a();
            b = a;
            c = EnumEntriesKt.enumEntries(a);
        }

        public Impression(String str, int i) {
        }

        public static final /* synthetic */ Impression[] a() {
            return new Impression[]{INTERNAL, INTERNET_UNAVAILABLE, TOO_MANY_CONNECTIONS, WRONG_ORIENTATION, FIRST_SESSION_INTERSTITIALS_DISABLED, NETWORK_FAILURE, NO_AD_FOUND, SESSION_NOT_STARTED, IMPRESSION_ALREADY_VISIBLE, NO_HOST_ACTIVITY, USER_CANCELLATION, INVALID_LOCATION, VIDEO_UNAVAILABLE, VIDEO_ID_MISSING, ERROR_PLAYING_VIDEO, INVALID_RESPONSE, ASSETS_DOWNLOAD_FAILURE, ERROR_CREATING_VIEW, ERROR_DISPLAYING_VIEW, INCOMPATIBLE_API_VERSION, ERROR_LOADING_WEB_VIEW, ASSET_PREFETCH_IN_PROGRESS, ACTIVITY_MISSING_IN_MANIFEST, EMPTY_LOCAL_VIDEO_LIST, END_POINT_DISABLED, HARDWARE_ACCELERATION_DISABLED, PENDING_IMPRESSION_ERROR, VIDEO_UNAVAILABLE_FOR_CURRENT_ORIENTATION, ASSET_MISSING, WEB_VIEW_PAGE_LOAD_TIMEOUT, WEB_VIEW_CLIENT_RECEIVED_ERROR, INTERNET_UNAVAILABLE_AT_SHOW, INTERNET_UNAVAILABLE_AT_CACHE};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return c;
        }

        public static Impression valueOf(String str) {
            return (Impression) Enum.valueOf(Impression.class, str);
        }

        public static Impression[] values() {
            return (Impression[]) b.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Internal;", "", "Lcom/chartboost/sdk/internal/Model/CBError$Type;", "(Ljava/lang/String;I)V", "MISCELLANEOUS", "INTERNET_UNAVAILABLE", "INVALID_RESPONSE", "UNEXPECTED_RESPONSE", "NETWORK_FAILURE", "HTTP_NOT_FOUND", "HTTP_NOT_OK", "UNSUPPORTED_OS_VERSION", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Internal implements Type {
        public static final /* synthetic */ Internal[] b;
        public static final /* synthetic */ EnumEntries c;
        public static final Internal MISCELLANEOUS = new Internal("MISCELLANEOUS", 0);
        public static final Internal INTERNET_UNAVAILABLE = new Internal("INTERNET_UNAVAILABLE", 1);
        public static final Internal INVALID_RESPONSE = new Internal("INVALID_RESPONSE", 2);
        public static final Internal UNEXPECTED_RESPONSE = new Internal("UNEXPECTED_RESPONSE", 3);
        public static final Internal NETWORK_FAILURE = new Internal("NETWORK_FAILURE", 4);
        public static final Internal HTTP_NOT_FOUND = new Internal("HTTP_NOT_FOUND", 5);
        public static final Internal HTTP_NOT_OK = new Internal("HTTP_NOT_OK", 6);
        public static final Internal UNSUPPORTED_OS_VERSION = new Internal("UNSUPPORTED_OS_VERSION", 7);

        static {
            Internal[] a = a();
            b = a;
            c = EnumEntriesKt.enumEntries(a);
        }

        public Internal(String str, int i) {
        }

        public static final /* synthetic */ Internal[] a() {
            return new Internal[]{MISCELLANEOUS, INTERNET_UNAVAILABLE, INVALID_RESPONSE, UNEXPECTED_RESPONSE, NETWORK_FAILURE, HTTP_NOT_FOUND, HTTP_NOT_OK, UNSUPPORTED_OS_VERSION};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return c;
        }

        public static Internal valueOf(String str) {
            return (Internal) Enum.valueOf(Internal.class, str);
        }

        public static Internal[] values() {
            return (Internal[]) b.clone();
        }

        @Override // com.chartboost.sdk.internal.Model.CBError.Type
        public /* bridge */ /* synthetic */ String getName() {
            return name();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/chartboost/sdk/internal/Model/CBError$Type;", "", "name", "", "getName", "()Ljava/lang/String;", "Lcom/chartboost/sdk/internal/Model/CBError$Click;", "Lcom/chartboost/sdk/internal/Model/CBError$Impression;", "Lcom/chartboost/sdk/internal/Model/CBError$Internal;", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Type {
        @NotNull
        String getName();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBError(@NotNull Type type, @NotNull String errorDesc) {
        super(errorDesc);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(errorDesc, "errorDesc");
        this.type = type;
        this.errorDesc = errorDesc;
    }

    @NotNull
    public final String getErrorDesc() {
        return this.errorDesc;
    }

    @NotNull
    public final Impression getImpressionError() {
        Type type = this.type;
        return type == Internal.INTERNET_UNAVAILABLE ? Impression.INTERNET_UNAVAILABLE : type == Internal.HTTP_NOT_FOUND ? Impression.NO_AD_FOUND : type == Internal.INVALID_RESPONSE ? Impression.INVALID_RESPONSE : type == Internal.NETWORK_FAILURE ? Impression.NETWORK_FAILURE : Impression.INTERNAL;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }
}
