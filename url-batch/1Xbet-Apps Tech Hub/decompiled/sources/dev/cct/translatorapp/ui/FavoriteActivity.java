package dev.cct.translatorapp.ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
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
import dev.cct.translatorapp.adapter.FavoriteAdapter;
import dev.cct.translatorapp.adapter.HistoryAdapter;
import dev.cct.translatorapp.dataModel.HistoryModel;
import dev.cct.translatorapp.databinding.ActivityFavoriteBinding;
import dev.cct.translatorapp.viewModel.HistoryViewModel;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FavoriteActivity.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010\u0016\u001a\u00020\u0019H\u0002J\b\u0010,\u001a\u00020\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, d2 = {"Ldev/cct/translatorapp/ui/FavoriteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldev/cct/translatorapp/adapter/HistoryAdapter$Favorite;", "()V", "adapter", "Ldev/cct/translatorapp/adapter/FavoriteAdapter;", "binding", "Ldev/cct/translatorapp/databinding/ActivityFavoriteBinding;", "getBinding", "()Ldev/cct/translatorapp/databinding/ActivityFavoriteBinding;", "setBinding", "(Ldev/cct/translatorapp/databinding/ActivityFavoriteBinding;)V", "historyViewModel", "Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "getHistoryViewModel", "()Ldev/cct/translatorapp/viewModel/HistoryViewModel;", "historyViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "hideDeleteBtn", "initListeners", "languageChange", "context", "locale", "Ljava/util/Locale;", "onBackPressed", "onClickFavorite", "itemsViewModel", "Ldev/cct/translatorapp/dataModel/HistoryModel;", "position", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onTranslationClick", "showDeleteBtn", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteActivity extends AppCompatActivity implements HistoryAdapter.Favorite {
    private FavoriteAdapter adapter;
    public ActivityFavoriteBinding binding;

    /* renamed from: historyViewModel$delegate, reason: from kotlin metadata */
    private final Lazy historyViewModel;
    public RecyclerView recyclerView;

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void hideDeleteBtn() {
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void showDeleteBtn() {
    }

    public FavoriteActivity() {
        final FavoriteActivity favoriteActivity = this;
        final Function0 function0 = null;
        this.historyViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(HistoryViewModel.class), new Function0<ViewModelStore>() { // from class: dev.cct.translatorapp.ui.FavoriteActivity$special$$inlined$viewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: dev.cct.translatorapp.ui.FavoriteActivity$historyViewModel$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                Application application = FavoriteActivity.this.getApplication();
                Intrinsics.checkNotNull(application, "null cannot be cast to non-null type dev.cct.translatorapp.MainApplication");
                return new HistoryViewModel.HistoryViewModelFactory(((MainApplication) application).getRepository());
            }
        }, new Function0<CreationExtras>() { // from class: dev.cct.translatorapp.ui.FavoriteActivity$special$$inlined$viewModels$default$3
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
                CreationExtras defaultViewModelCreationExtras = favoriteActivity.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        });
    }

    public final ActivityFavoriteBinding getBinding() {
        ActivityFavoriteBinding activityFavoriteBinding = this.binding;
        if (activityFavoriteBinding != null) {
            return activityFavoriteBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(ActivityFavoriteBinding activityFavoriteBinding) {
        Intrinsics.checkNotNullParameter(activityFavoriteBinding, "<set-?>");
        this.binding = activityFavoriteBinding;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        return null;
    }

    public final void setRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.recyclerView = recyclerView;
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
        ActivityFavoriteBinding inflate = ActivityFavoriteBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        setBinding(inflate);
        setContentView(getBinding().getRoot());
        RecyclerView recyclerView = getBinding().favoriteRecy;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.favoriteRecy");
        setRecyclerView(recyclerView);
        getRecyclerView().setLayoutManager(new LinearLayoutManager(this));
        setRecyclerView();
        initListeners();
    }

    private final void initListeners() {
        getBinding().backBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.ui.FavoriteActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FavoriteActivity.initListeners$lambda$1$lambda$0(FavoriteActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListeners$lambda$1$lambda$0(FavoriteActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
        this$0.overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    private final void setRecyclerView() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new FavoriteActivity$setRecyclerView$1(this, null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void onClickFavorite(HistoryModel itemsViewModel, int position) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(getHistoryViewModel()), Dispatchers.getIO(), null, new FavoriteActivity$onClickFavorite$1(this, itemsViewModel, null), 2, null);
    }

    @Override // dev.cct.translatorapp.adapter.HistoryAdapter.Favorite
    public void onTranslationClick(HistoryModel itemsViewModel) {
        Intrinsics.checkNotNullParameter(itemsViewModel, "itemsViewModel");
        Intent intent = new Intent(this, (Class<?>) TextTranslation.class);
        intent.putExtra("translation", itemsViewModel);
        startActivity(intent);
    }
}
