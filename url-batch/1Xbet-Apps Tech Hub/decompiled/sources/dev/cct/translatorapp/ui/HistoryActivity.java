package dev.cct.translatorapp.ui;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.MainApplication;
import dev.cct.translatorapp.adapter.HistoryAdapter;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.databinding.ActivityHistoryBinding;
import dev.cct.translatorapp.databinding.DeleteDialogBinding;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: HistoryActivity.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u0006\u0010 \u001a\u00020\u0019J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0016J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\bH\u0016J\u0011\u0010.\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0019H\u0016J\b\u00101\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Ldev/cct/translatorapp/ui/HistoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/HistoryAdapter;", "allHistory", "Ljava/util/ArrayList;", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "Lkotlin/collections/ArrayList;", "binding", "Ldev/cct/translatorapp/databinding/ActivityHistoryBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityHistoryBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityHistoryBinding;)V", "historyViewModel", "Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "getHistoryViewModel", "()Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "historyViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "deleteTranslations", "delPressDialog", "Landroid/app/Dialog;", "hideDeleteBtn", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onClickFavorite", "itemsViewModel", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTranslationClick", "setRecyclerView", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDeleteBtn", "showDialog", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HistoryActivity extends AppCompatActivity implements HistoryAdapter.Favorite {
    private HistoryAdapter adapter;
    private ArrayList<HistoryModel> allHistory = new ArrayList<>();
    public ActivityHistoryBinding binding;

    /* renamed from: historyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy historyViewModel;
    private RecyclerView recyclerView;

    public HistoryActivity() {
        final HistoryActivity historyActivity = this;
        final Function0 function0 = null;
        this.historyViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new Function0<ViewModelStore>() { // from class: dev.cct.translatorapp.ui.HistoryActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = ComponentActivity.this.getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return viewModelStore;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: dev.cct.translatorapp.ui.HistoryActivity$historyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = HistoryActivity.this.getApplication();
                Intrinsics.checkNotNull(application, "null cannot be cast to non-null type dev.cct.translatorapp.MainApplication");
                return new HistoryViewModel.HistoryViewModelFactory(((MainApplication) application).getRepository());
            }
        }, new Function0<CreationExtras>() { // from class: dev.cct.translatorapp.ui.HistoryActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = historyActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final ActivityHistoryBinding getBinding() {
        ActivityHistoryBinding activityHistoryBinding = this.binding;
        if (activityHistoryBinding != null) {
            return activityHistoryBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityHistoryBinding activityHistoryBinding) {
        Intrinsics.checkNotNullParameter(activityHistoryBinding, "<set-?>");
        this.binding = activityHistoryBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HistoryViewModel getHistoryViewModel() {
        return (HistoryViewModel) this.historyViewModel.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        String string = newBase.getSharedPreferences(newBase.getPackageName(), 0).getString("code", "en");
        Intrinsics.checkNotNull(string);
        Locale locale = new Locale(string);
        Locale.setDefault(locale);
        super.attachBaseContext(languageChange(newBase, locale));
    }

    private final Context languageChange(Context context, Locale locale) {
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        LocaleList localeList = new LocaleList(locale);
        LocaleList.setDefault(localeList);
        configuration.setLocales(localeList);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "tempContext.createConfig…ionContext(configuration)");
        return createConfigurationContext;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHistoryBinding inflate = ActivityHistoryBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        RecyclerView recyclerView = getBinding().historyRecy;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.historyRecy");
        this.recyclerView = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HistoryActivity$onCreate$1(this, null), 3, null);
        initListeners();
    }

    public final void initListeners() {
        final ActivityHistoryBinding binding = getBinding();
        binding.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.initListeners$lambda$4$lambda$0(HistoryActivity.this, view);
            }
        });
        binding.backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.initListeners$lambda$4$lambda$1(HistoryActivity.this, view);
            }
        });
        binding.deleteHistoryIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.initListeners$lambda$4$lambda$2(ActivityHistoryBinding.this, this, view);
            }
        });
        binding.selectAllLayout.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.initListeners$lambda$4$lambda$3(ActivityHistoryBinding.this, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$0(HistoryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$1(HistoryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (HomeScreenActivity.INSTANCE.getFromHome()) {
            HomeScreenActivity.INSTANCE.setFromHome(false);
            ExtensionFunction.INSTANCE.openActivity(this$0, HomeScreenActivity.class);
        } else {
            this$0.finish();
        }
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$2(ActivityHistoryBinding this_with, HistoryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.deleteHistoryIcon.setVisibility(8);
        this_with.selectAllLayout.setVisibility(0);
        HistoryAdapter historyAdapter = this$0.adapter;
        if (historyAdapter != null) {
            historyAdapter.showCheckBox();
        }
        HistoryAdapter historyAdapter2 = this$0.adapter;
        if (historyAdapter2 != null) {
            historyAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$4$lambda$3(ActivityHistoryBinding this_with, HistoryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this_with.selectAllCheckbox.setImageResource(R.drawable.selected_icon);
        this_with.deleteBtn.setVisibility(0);
        HistoryAdapter historyAdapter = this$0.adapter;
        if (historyAdapter != null) {
            ImageView selectAllCheckbox = this_with.selectAllCheckbox;
            Intrinsics.checkNotNullExpressionValue(selectAllCheckbox, "selectAllCheckbox");
            historyAdapter.selectAllClicked(selectAllCheckbox);
        }
        HistoryAdapter historyAdapter2 = this$0.adapter;
        if (historyAdapter2 != null) {
            historyAdapter2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        android.util.Log.d("TAG", "setRecyclerView: failed with exception=" + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setRecyclerView(Continuation<? super Unit> continuation) {
        HistoryActivity$setRecyclerView$1 historyActivity$setRecyclerView$1;
        int i;
        if (continuation instanceof HistoryActivity$setRecyclerView$1) {
            historyActivity$setRecyclerView$1 = (HistoryActivity$setRecyclerView$1) continuation;
            if ((historyActivity$setRecyclerView$1.label & Integer.MIN_VALUE) != 0) {
                historyActivity$setRecyclerView$1.label -= Integer.MIN_VALUE;
                Object obj = historyActivity$setRecyclerView$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = historyActivity$setRecyclerView$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<HistoryModel> translations = getHistoryViewModel().getTranslations();
                    Intrinsics.checkNotNull(translations, "null cannot be cast to non-null type java.util.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<dev.cct.translatorapp.dataModel.HistoryModel> }");
                    this.allHistory = (ArrayList) translations;
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    HistoryActivity$setRecyclerView$2 historyActivity$setRecyclerView$2 = new HistoryActivity$setRecyclerView$2(this, null);
                    historyActivity$setRecyclerView$1.label = 1;
                    if (BuildersKt.withContext(main, historyActivity$setRecyclerView$2, historyActivity$setRecyclerView$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        historyActivity$setRecyclerView$1 = new HistoryActivity$setRecyclerView$1(this, continuation);
        Object obj2 = historyActivity$setRecyclerView$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = historyActivity$setRecyclerView$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (HomeScreenActivity.INSTANCE.getFromHome()) {
            HomeScreenActivity.INSTANCE.setFromHome(false);
            ExtensionFunction.INSTANCE.openActivity(this, HomeScreenActivity.class);
        } else {
            finish();
        }
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void showDialog() {
        DeleteDialogBinding inflate = DeleteDialogBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(inflate.getRoot());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window2 = dialog.getWindow();
        layoutParams.copyFrom(window2 != null ? window2.getAttributes() : null);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.gravity = 17;
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setAttributes(layoutParams);
        }
        dialog.show();
        inflate.cancelBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.showDialog$lambda$5(dialog, this, view);
            }
        });
        inflate.deleteBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.HistoryActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.showDialog$lambda$6(HistoryActivity.this, dialog, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$5(Dialog delPressDialog, HistoryActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(delPressDialog, "$delPressDialog");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        delPressDialog.cancel();
        HistoryAdapter historyAdapter = this$0.adapter;
        if (historyAdapter != null) {
            historyAdapter.hideCheckBox();
        }
        this$0.getBinding().deleteBtn.setVisibility(8);
        this$0.getBinding().selectAllLayout.setVisibility(8);
        this$0.getBinding().deleteHistoryIcon.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialog$lambda$6(HistoryActivity this$0, Dialog delPressDialog, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delPressDialog, "$delPressDialog");
        this$0.deleteTranslations(delPressDialog);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void onClickFavorite(HistoryModel itemsViewModel, int position) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(getHistoryViewModel()), Dispatchers.getIO(), null, new HistoryActivity$onClickFavorite$1(this, itemsViewModel, position, null), 2, null);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void onTranslationClick(HistoryModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        Intent intent = new Intent(this, (Class<?>) TextTranslation.class);
        intent.putExtra("translation", itemsViewModel);
        startActivity(intent);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void showDeleteBtn() {
        getBinding().deleteBtn.setVisibility(0);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void hideDeleteBtn() {
        getBinding().deleteBtn.setVisibility(4);
    }

    private final void deleteTranslations(Dialog delPressDialog) {
        HistoryAdapter historyAdapter = this.adapter;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new HistoryActivity$deleteTranslations$1(historyAdapter != null ? historyAdapter.getArrayToDelete() : null, this, delPressDialog, null), 3, null);
    }
}
