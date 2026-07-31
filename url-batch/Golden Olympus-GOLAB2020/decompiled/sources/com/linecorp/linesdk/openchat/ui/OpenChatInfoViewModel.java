package com.linecorp.linesdk.openchat.ui;

import a2.AbstractC1241b;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC1358y;
import androidx.lifecycle.B;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.openchat.OpenChatCategory;
import com.linecorp.linesdk.openchat.OpenChatParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m.InterfaceC3255a;
import o2.AbstractC3313G;
import o2.AbstractC3333i;
import o2.AbstractC3337k;
import o2.Z;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class OpenChatInfoViewModel extends V {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final OpenChatCategory DEFAULT_CATEGORY = OpenChatCategory.NotSelected;

    @NotNull
    private static final String KEY_PROFILE_NAME = "key_profile_name";

    @NotNull
    private final B _createChatRoomError;

    @NotNull
    private final B _isCreatingChatRoom;

    @NotNull
    private final B _openChatRoomInfo;

    @NotNull
    private final B _shouldShowAgreementWarning;

    @NotNull
    private final B category;

    @NotNull
    private final B chatroomName;

    @NotNull
    private final B description;

    @NotNull
    private final AbstractC1358y isProfileValid;

    @NotNull
    private final B isSearchIncluded;

    @NotNull
    private final AbstractC1358y isValid;

    @NotNull
    private final LineApiClient lineApiClient;

    @NotNull
    private final B profileName;

    @NotNull
    private final SharedPreferences sharedPreferences;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public OpenChatInfoViewModel(@NotNull SharedPreferences sharedPreferences, @NotNull LineApiClient lineApiClient) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(lineApiClient, "lineApiClient");
        this.sharedPreferences = sharedPreferences;
        this.lineApiClient = lineApiClient;
        B b4 = new B();
        this.chatroomName = b4;
        B b5 = new B();
        this.profileName = b5;
        B b6 = new B();
        this.description = b6;
        B b7 = new B();
        this.category = b7;
        B b8 = new B();
        this.isSearchIncluded = b8;
        this._openChatRoomInfo = new B();
        this._createChatRoomError = new B();
        this._isCreatingChatRoom = new B();
        this._shouldShowAgreementWarning = new B();
        AbstractC1358y a4 = U.a(b4, new InterfaceC3255a() { // from class: com.linecorp.linesdk.openchat.ui.r
            @Override // m.InterfaceC3255a
            public final Object apply(Object obj) {
                boolean isValid$isNotEmpty__proxy;
                isValid$isNotEmpty__proxy = OpenChatInfoViewModel.isValid$isNotEmpty__proxy((String) obj);
                return Boolean.valueOf(isValid$isNotEmpty__proxy);
            }
        });
        Intrinsics.checkNotNullExpressionValue(a4, "map(chatroomName, String::isNotEmpty)");
        this.isValid = a4;
        AbstractC1358y a5 = U.a(b5, new InterfaceC3255a() { // from class: com.linecorp.linesdk.openchat.ui.s
            @Override // m.InterfaceC3255a
            public final Object apply(Object obj) {
                boolean isProfileValid$isNotEmpty__proxy$0;
                isProfileValid$isNotEmpty__proxy$0 = OpenChatInfoViewModel.isProfileValid$isNotEmpty__proxy$0((String) obj);
                return Boolean.valueOf(isProfileValid$isNotEmpty__proxy$0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(a5, "map(profileName, String::isNotEmpty)");
        this.isProfileValid = a5;
        b4.o("");
        b5.o(getSavedProfileName());
        b6.o("");
        b7.o(DEFAULT_CATEGORY);
        b8.o(Boolean.TRUE);
        checkAgreementStatus();
    }

    private final void checkAgreementStatus() {
        AbstractC3337k.d(W.a(this), null, null, new OpenChatInfoViewModel$checkAgreementStatus$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAgreementStatusAsync(kotlin.coroutines.d dVar) {
        OpenChatInfoViewModel$checkAgreementStatusAsync$1 openChatInfoViewModel$checkAgreementStatusAsync$1;
        int i4;
        if (dVar instanceof OpenChatInfoViewModel$checkAgreementStatusAsync$1) {
            openChatInfoViewModel$checkAgreementStatusAsync$1 = (OpenChatInfoViewModel$checkAgreementStatusAsync$1) dVar;
            int i5 = openChatInfoViewModel$checkAgreementStatusAsync$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                openChatInfoViewModel$checkAgreementStatusAsync$1.label = i5 - Integer.MIN_VALUE;
                Object obj = openChatInfoViewModel$checkAgreementStatusAsync$1.result;
                Object f4 = AbstractC1241b.f();
                i4 = openChatInfoViewModel$checkAgreementStatusAsync$1.label;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    AbstractC3313G b4 = Z.b();
                    OpenChatInfoViewModel$checkAgreementStatusAsync$2 openChatInfoViewModel$checkAgreementStatusAsync$2 = new OpenChatInfoViewModel$checkAgreementStatusAsync$2(this, null);
                    openChatInfoViewModel$checkAgreementStatusAsync$1.label = 1;
                    obj = AbstractC3333i.g(b4, openChatInfoViewModel$checkAgreementStatusAsync$2, openChatInfoViewModel$checkAgreementStatusAsync$1);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "private suspend fun chec…openChatAgreementStatus }");
                return obj;
            }
        }
        openChatInfoViewModel$checkAgreementStatusAsync$1 = new OpenChatInfoViewModel$checkAgreementStatusAsync$1(this, dVar);
        Object obj2 = openChatInfoViewModel$checkAgreementStatusAsync$1.result;
        Object f42 = AbstractC1241b.f();
        i4 = openChatInfoViewModel$checkAgreementStatusAsync$1.label;
        if (i4 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "private suspend fun chec…openChatAgreementStatus }");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createChatRoomAsync(OpenChatParameters openChatParameters, kotlin.coroutines.d dVar) {
        OpenChatInfoViewModel$createChatRoomAsync$1 openChatInfoViewModel$createChatRoomAsync$1;
        int i4;
        if (dVar instanceof OpenChatInfoViewModel$createChatRoomAsync$1) {
            openChatInfoViewModel$createChatRoomAsync$1 = (OpenChatInfoViewModel$createChatRoomAsync$1) dVar;
            int i5 = openChatInfoViewModel$createChatRoomAsync$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                openChatInfoViewModel$createChatRoomAsync$1.label = i5 - Integer.MIN_VALUE;
                Object obj = openChatInfoViewModel$createChatRoomAsync$1.result;
                Object f4 = AbstractC1241b.f();
                i4 = openChatInfoViewModel$createChatRoomAsync$1.label;
                if (i4 != 0) {
                    ResultKt.a(obj);
                    AbstractC3313G b4 = Z.b();
                    OpenChatInfoViewModel$createChatRoomAsync$2 openChatInfoViewModel$createChatRoomAsync$2 = new OpenChatInfoViewModel$createChatRoomAsync$2(this, openChatParameters, null);
                    openChatInfoViewModel$createChatRoomAsync$1.label = 1;
                    obj = AbstractC3333i.g(b4, openChatInfoViewModel$createChatRoomAsync$2, openChatInfoViewModel$createChatRoomAsync$1);
                    if (obj == f4) {
                        return f4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.a(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "private suspend fun crea…oom(openChatParameters) }");
                return obj;
            }
        }
        openChatInfoViewModel$createChatRoomAsync$1 = new OpenChatInfoViewModel$createChatRoomAsync$1(this, dVar);
        Object obj2 = openChatInfoViewModel$createChatRoomAsync$1.result;
        Object f42 = AbstractC1241b.f();
        i4 = openChatInfoViewModel$createChatRoomAsync$1.label;
        if (i4 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "private suspend fun crea…oom(openChatParameters) }");
        return obj2;
    }

    private final OpenChatParameters generateOpenChatParameters() {
        String str = (String) this.chatroomName.f();
        if (str == null) {
            str = "";
        }
        String str2 = (String) this.description.f();
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (String) this.profileName.f();
        String str4 = str3 != null ? str3 : "";
        OpenChatCategory openChatCategory = (OpenChatCategory) this.category.f();
        if (openChatCategory == null) {
            openChatCategory = DEFAULT_CATEGORY;
        }
        Intrinsics.checkNotNullExpressionValue(openChatCategory, "category.value ?: DEFAULT_CATEGORY");
        Boolean bool = (Boolean) this.isSearchIncluded.f();
        if (bool == null) {
            bool = Boolean.TRUE;
        }
        return new OpenChatParameters(str, str2, str4, openChatCategory, bool.booleanValue());
    }

    private final String getSavedProfileName() {
        String string = this.sharedPreferences.getString(KEY_PROFILE_NAME, null);
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isProfileValid$isNotEmpty__proxy$0(CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValid$isNotEmpty__proxy(CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    private final void saveProfileName() {
        SharedPreferences.Editor editor = this.sharedPreferences.edit();
        Intrinsics.checkExpressionValueIsNotNull(editor, "editor");
        editor.putString(KEY_PROFILE_NAME, (String) this.profileName.f());
        editor.apply();
    }

    public final void createChatroom() {
        saveProfileName();
        AbstractC3337k.d(W.a(this), null, null, new OpenChatInfoViewModel$createChatroom$1(this, generateOpenChatParameters(), null), 3, null);
    }

    @NotNull
    public final B getCategory() {
        return this.category;
    }

    @NotNull
    public final String[] getCategoryStringArray(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        OpenChatCategory[] values = OpenChatCategory.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (OpenChatCategory openChatCategory : values) {
            arrayList.add(context.getResources().getString(openChatCategory.getResourceId()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    @NotNull
    public final B getChatroomName() {
        return this.chatroomName;
    }

    @NotNull
    public final AbstractC1358y getCreateChatRoomError() {
        return this._createChatRoomError;
    }

    @NotNull
    public final B getDescription() {
        return this.description;
    }

    @NotNull
    public final AbstractC1358y getOpenChatRoomInfo() {
        return this._openChatRoomInfo;
    }

    @NotNull
    public final B getProfileName() {
        return this.profileName;
    }

    @NotNull
    public final OpenChatCategory getSelectedCategory(int i4) {
        OpenChatCategory[] values = OpenChatCategory.values();
        return (i4 < 0 || i4 > AbstractC3219i.M(values)) ? DEFAULT_CATEGORY : values[i4];
    }

    @NotNull
    public final AbstractC1358y getShouldShowAgreementWarning() {
        return this._shouldShowAgreementWarning;
    }

    @NotNull
    public final AbstractC1358y isCreatingChatRoom() {
        return this._isCreatingChatRoom;
    }

    @NotNull
    public final AbstractC1358y isProfileValid() {
        return this.isProfileValid;
    }

    @NotNull
    public final B isSearchIncluded() {
        return this.isSearchIncluded;
    }

    @NotNull
    public final AbstractC1358y isValid() {
        return this.isValid;
    }
}
