package com.linecorp.linesdk.openchat.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import androidx.lifecycle.C;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.a0;
import b0.AbstractC1367a;
import com.linecorp.linesdk.ActionResult;
import com.linecorp.linesdk.Constants;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineApiResponse;
import com.linecorp.linesdk.R;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.auth.internal.LineAppVersion;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class CreateOpenChatActivity extends androidx.appcompat.app.d {

    @NotNull
    private static final String ARG_CHANNEL_ID = "arg_channel_id";

    @NotNull
    public static final String ARG_ERROR_RESULT = "arg_error_result";

    @NotNull
    public static final String ARG_OPEN_CHATROOM_INFO = "arg_open_chatroom_info";

    @NotNull
    public static final Companion Companion = new Companion(null);
    private OpenChatInfoViewModel viewModel;

    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @NotNull
    private final W1.h lineApiClient$delegate = W1.i.b(new CreateOpenChatActivity$lineApiClient$2(this));

    @NotNull
    private CreateOpenChatStep currentStep = CreateOpenChatStep.ChatroomInfo;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull String channelId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(channelId, "channelId");
            Intent putExtra = new Intent(context, (Class<?>) CreateOpenChatActivity.class).putExtra(CreateOpenChatActivity.ARG_CHANNEL_ID, channelId);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, CreateOp…RG_CHANNEL_ID, channelId)");
            return putExtra;
        }

        @NotNull
        public final ActionResult<OpenChatRoomInfo, LineApiError> getChatRoomCreationResult(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra(CreateOpenChatActivity.ARG_OPEN_CHATROOM_INFO);
            OpenChatRoomInfo openChatRoomInfo = parcelableExtra instanceof OpenChatRoomInfo ? (OpenChatRoomInfo) parcelableExtra : null;
            if (openChatRoomInfo != null) {
                return new ActionResult.Success(openChatRoomInfo);
            }
            Parcelable parcelableExtra2 = intent.getParcelableExtra(CreateOpenChatActivity.ARG_ERROR_RESULT);
            LineApiError lineApiError = parcelableExtra2 instanceof LineApiError ? (LineApiError) parcelableExtra2 : null;
            if (lineApiError != null) {
                return new ActionResult.Error(lineApiError);
            }
            LineApiError DEFAULT = LineApiError.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            return new ActionResult.Error(DEFAULT);
        }

        private Companion() {
        }
    }

    @Metadata
    private enum CreateOpenChatStep {
        ChatroomInfo,
        UserProfile
    }

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateOpenChatStep.values().length];
            try {
                iArr[CreateOpenChatStep.ChatroomInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateOpenChatStep.UserProfile.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int addFragment(CreateOpenChatStep createOpenChatStep, boolean z4) {
        z o4 = getSupportFragmentManager().o();
        if (z4) {
            o4.f(createOpenChatStep.name());
        }
        o4.n(R.id.container, createFragment(createOpenChatStep));
        return o4.g();
    }

    static /* synthetic */ int addFragment$default(CreateOpenChatActivity createOpenChatActivity, CreateOpenChatStep createOpenChatStep, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = true;
        }
        return createOpenChatActivity.addFragment(createOpenChatStep, z4);
    }

    private final Fragment createFragment(CreateOpenChatStep createOpenChatStep) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[createOpenChatStep.ordinal()];
        if (i4 == 1) {
            return OpenChatInfoFragment.Companion.newInstance();
        }
        if (i4 == 2) {
            return ProfileInfoFragment.Companion.newInstance();
        }
        throw new W1.m();
    }

    @NotNull
    public static final Intent createIntent(@NotNull Context context, @NotNull String str) {
        return Companion.createIntent(context, str);
    }

    @NotNull
    public static final ActionResult<OpenChatRoomInfo, LineApiError> getChatRoomCreationResult(@NotNull Intent intent) {
        return Companion.getChatRoomCreationResult(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LineApiClient getLineApiClient() {
        return (LineApiClient) this.lineApiClient$delegate.getValue();
    }

    private final void initViewModel() {
        final SharedPreferences sharedPreferences = getSharedPreferences("openchat", 0);
        OpenChatInfoViewModel openChatInfoViewModel = (OpenChatInfoViewModel) a0.b(this, new Y.b() { // from class: com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity$initViewModel$1
            @Override // androidx.lifecycle.Y.b
            @NotNull
            public /* bridge */ /* synthetic */ V create(@NotNull Class cls, @NotNull AbstractC1367a abstractC1367a) {
                return super.create(cls, abstractC1367a);
            }

            @Override // androidx.lifecycle.Y.b
            @NotNull
            public <T extends V> T create(@NotNull Class<T> modelClass) {
                LineApiClient lineApiClient;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                if (!modelClass.isAssignableFrom(OpenChatInfoViewModel.class)) {
                    throw new IllegalStateException("Unknown ViewModel class");
                }
                SharedPreferences sharedPreferences2 = sharedPreferences;
                Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "sharedPreferences");
                lineApiClient = this.getLineApiClient();
                return new OpenChatInfoViewModel(sharedPreferences2, lineApiClient);
            }
        }).a(OpenChatInfoViewModel.class);
        this.viewModel = openChatInfoViewModel;
        OpenChatInfoViewModel openChatInfoViewModel2 = null;
        if (openChatInfoViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel = null;
        }
        openChatInfoViewModel.getOpenChatRoomInfo().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.e
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                CreateOpenChatActivity.initViewModel$lambda$0(CreateOpenChatActivity.this, (OpenChatRoomInfo) obj);
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel3 = this.viewModel;
        if (openChatInfoViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel3 = null;
        }
        openChatInfoViewModel3.getCreateChatRoomError().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.f
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                CreateOpenChatActivity.initViewModel$lambda$1(CreateOpenChatActivity.this, (LineApiResponse) obj);
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel4 = this.viewModel;
        if (openChatInfoViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            openChatInfoViewModel4 = null;
        }
        openChatInfoViewModel4.isCreatingChatRoom().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.g
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                CreateOpenChatActivity.initViewModel$lambda$2(CreateOpenChatActivity.this, (Boolean) obj);
            }
        });
        OpenChatInfoViewModel openChatInfoViewModel5 = this.viewModel;
        if (openChatInfoViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            openChatInfoViewModel2 = openChatInfoViewModel5;
        }
        openChatInfoViewModel2.getShouldShowAgreementWarning().i(this, new C() { // from class: com.linecorp.linesdk.openchat.ui.h
            @Override // androidx.lifecycle.C
            public final void d(Object obj) {
                CreateOpenChatActivity.initViewModel$lambda$3(CreateOpenChatActivity.this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewModel$lambda$0(CreateOpenChatActivity this$0, OpenChatRoomInfo openChatRoomInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(-1, new Intent().putExtra(ARG_OPEN_CHATROOM_INFO, openChatRoomInfo));
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewModel$lambda$1(CreateOpenChatActivity this$0, LineApiResponse lineApiResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setResult(-1, new Intent().putExtra(ARG_ERROR_RESULT, lineApiResponse.getErrorData()));
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewModel$lambda$2(CreateOpenChatActivity this$0, Boolean isCreatingChatRoom) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ProgressBar progressBar = (ProgressBar) this$0._$_findCachedViewById(R.id.progressBar);
        Intrinsics.checkNotNullExpressionValue(isCreatingChatRoom, "isCreatingChatRoom");
        progressBar.setVisibility(isCreatingChatRoom.booleanValue() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViewModel$lambda$3(CreateOpenChatActivity this$0, Boolean shouldShowWarning) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(shouldShowWarning, "shouldShowWarning");
        if (shouldShowWarning.booleanValue()) {
            this$0.showAgreementWarningDialog();
        }
    }

    private final void launchLineApp() {
        startActivity(getPackageManager().getLaunchIntentForPackage(Constants.LINE_APP_PACKAGE_NAME));
    }

    private final void showAgreementWarningDialog() {
        boolean z4 = LineAppVersion.getLineAppVersion(this) != null;
        c.a h4 = new c.a(this).f(R.string.openchat_not_agree_with_terms).h(new DialogInterface.OnDismissListener() { // from class: com.linecorp.linesdk.openchat.ui.a
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CreateOpenChatActivity.showAgreementWarningDialog$lambda$4(CreateOpenChatActivity.this, dialogInterface);
            }
        });
        if (z4) {
            h4.j(R.string.open_line, new DialogInterface.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    CreateOpenChatActivity.showAgreementWarningDialog$lambda$8$lambda$5(CreateOpenChatActivity.this, dialogInterface, i4);
                }
            });
            h4.g(R.string.common_cancel, new DialogInterface.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    CreateOpenChatActivity.showAgreementWarningDialog$lambda$8$lambda$6(CreateOpenChatActivity.this, dialogInterface, i4);
                }
            });
        } else {
            h4.j(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.linecorp.linesdk.openchat.ui.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    CreateOpenChatActivity.showAgreementWarningDialog$lambda$8$lambda$7(CreateOpenChatActivity.this, dialogInterface, i4);
                }
            });
        }
        h4.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAgreementWarningDialog$lambda$4(CreateOpenChatActivity this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAgreementWarningDialog$lambda$8$lambda$5(CreateOpenChatActivity this$0, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.launchLineApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAgreementWarningDialog$lambda$8$lambda$6(CreateOpenChatActivity this$0, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAgreementWarningDialog$lambda$8$lambda$7(CreateOpenChatActivity this$0, DialogInterface dialogInterface, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i4) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i4);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i4), findViewById);
        return findViewById;
    }

    public final int goToNextScreen() {
        return addFragment$default(this, CreateOpenChatStep.UserProfile, false, 2, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, androidx.activity.j, androidx.core.app.h, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_create_open_chat);
        initViewModel();
        addFragment(this.currentStep, false);
    }
}
