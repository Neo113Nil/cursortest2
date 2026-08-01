package dev.cct.translatorapp.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RatingBar;
import androidx.activity.OnBackPressedCallback;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import dev.cct.translatorapp.databinding.AdNativeLayoutBinding;
import dev.cct.translatorapp.databinding.FragmentConversationBinding;
import dev.cct.translatorapp.ui.LunchingView;
import dev.cct.translatorapp.util.Preferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationFragment.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Ldev/cct/translatorapp/ads/ConversationFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Ldev/cct/translatorapp/databinding/FragmentConversationBinding;", "countAd", "", "currentNativeAd", "Lcom/google/android/gms/ads/nativead/NativeAd;", "mContext", "Landroid/content/Context;", "param1", "", "param2", "remoteConfig", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;", "initRemoteConfig", "", "onAttach", "context", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "populateNativeAdView", "nativeAd", "unifiedAdBinding", "Ldev/cct/translatorapp/databinding/AdNativeLayoutBinding;", "refreshAd", "Companion", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConversationFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private FragmentConversationBinding binding;
    private int countAd;
    private NativeAd currentNativeAd;
    private Context mContext;
    private String param1;
    private String param2;
    private FirebaseRemoteConfig remoteConfig;

    @JvmStatic
    public static final ConversationFragment newInstance(String str, String str2) {
        return INSTANCE.newInstance(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.mContext = context;
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: dev.cct.translatorapp.ads.ConversationFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentActivity activity = ConversationFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.param1 = arguments.getString("param1");
            this.param2 = arguments.getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentConversationBinding inflate = FragmentConversationBinding.inflate(getLayoutInflater(), container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater,container,false)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.remoteConfig = FirebaseRemoteConfig.getInstance();
        initRemoteConfig();
    }

    private final void initRemoteConfig() {
        FirebaseRemoteConfigSettings remoteConfigSettings = RemoteConfigKt.remoteConfigSettings(new Function1<FirebaseRemoteConfigSettings.Builder, Unit>() { // from class: dev.cct.translatorapp.ads.ConversationFragment$initRemoteConfig$configSettings$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FirebaseRemoteConfigSettings.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FirebaseRemoteConfigSettings.Builder remoteConfigSettings2) {
                Intrinsics.checkNotNullParameter(remoteConfigSettings2, "$this$remoteConfigSettings");
                remoteConfigSettings2.setMinimumFetchIntervalInSeconds(0L);
            }
        });
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        Intrinsics.checkNotNull(firebaseRemoteConfig);
        firebaseRemoteConfig.setConfigSettingsAsync(remoteConfigSettings);
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.remoteConfig;
        Intrinsics.checkNotNull(firebaseRemoteConfig2);
        firebaseRemoteConfig2.fetchAndActivate().addOnCompleteListener(requireActivity(), new OnCompleteListener() { // from class: dev.cct.translatorapp.ads.ConversationFragment$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ConversationFragment.initRemoteConfig$lambda$1(ConversationFragment.this, task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initRemoteConfig$lambda$1(ConversationFragment this$0, Task task) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            Log.d("zh", "Config parameters updated: " + ((Boolean) task.getResult()));
        } else {
            Log.d("zh", "Config parameters not updated");
        }
        Context requireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        Log.d("TAG", "initRemoteConfig: " + new Preferences(requireContext).isPreviousNative());
        this$0.refreshAd();
    }

    private final void refreshAd() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.remoteConfig;
        String string = firebaseRemoteConfig != null ? firebaseRemoteConfig.getString("native_voicetranslator") : null;
        if (string != null) {
            Context context = this.mContext;
            Intrinsics.checkNotNull(context);
            AdLoader.Builder builder = new AdLoader.Builder(context, string);
            builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: dev.cct.translatorapp.ads.ConversationFragment$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(NativeAd nativeAd) {
                    ConversationFragment.refreshAd$lambda$2(ConversationFragment.this, nativeAd);
                }
            });
            VideoOptions build = new VideoOptions.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().build()");
            NativeAdOptions build2 = new NativeAdOptions.Builder().setVideoOptions(build).build();
            Intrinsics.checkNotNullExpressionValue(build2, "Builder().setVideoOptions(videoOptions).build()");
            builder.withNativeAdOptions(build2);
            AdLoader build3 = builder.withAdListener(new AdListener() { // from class: dev.cct.translatorapp.ads.ConversationFragment$refreshAd$adLoader$1
                @Override // com.google.android.gms.ads.AdListener
                public void onAdClosed() {
                    super.onAdClosed();
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Intrinsics.checkNotNullParameter(loadAdError, "loadAdError");
                    super.onAdFailedToLoad(loadAdError);
                    Log.e("TAG", "Native onAdFailedToLoad " + loadAdError.getMessage());
                }

                @Override // com.google.android.gms.ads.AdListener
                public void onAdLoaded() {
                    FragmentConversationBinding fragmentConversationBinding;
                    super.onAdLoaded();
                    fragmentConversationBinding = ConversationFragment.this.binding;
                    if (fragmentConversationBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        fragmentConversationBinding = null;
                    }
                    fragmentConversationBinding.loadingAdTxt.setVisibility(8);
                    Log.e(AdRequest.LOGTAG, "onAdLoaded: ");
                }
            }).build();
            Intrinsics.checkNotNullExpressionValue(build3, "private fun refreshAd() …       }\n        }\n\n    }");
            if (LunchingView.INSTANCE.isAdLoaded()) {
                return;
            }
            build3.loadAd(new AdRequest.Builder().build());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshAd$lambda$2(ConversationFragment this$0, NativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Log.e("TAG", "refreshAd: " + nativeAd);
        LunchingView.INSTANCE.setAdLoaded(true);
        if (this$0.requireActivity().isDestroyed() || this$0.requireActivity().isFinishing() || this$0.requireActivity().isChangingConfigurations()) {
            nativeAd.destroy();
            return;
        }
        NativeAd nativeAd2 = this$0.currentNativeAd;
        if (nativeAd2 != null) {
            nativeAd2.destroy();
        }
        this$0.currentNativeAd = nativeAd;
        AdNativeLayoutBinding inflate = AdNativeLayoutBinding.inflate(this$0.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this$0.populateNativeAdView(nativeAd, inflate);
        FragmentConversationBinding fragmentConversationBinding = this$0.binding;
        FragmentConversationBinding fragmentConversationBinding2 = null;
        if (fragmentConversationBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentConversationBinding = null;
        }
        fragmentConversationBinding.adFrame.removeAllViews();
        FragmentConversationBinding fragmentConversationBinding3 = this$0.binding;
        if (fragmentConversationBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentConversationBinding3 = null;
        }
        fragmentConversationBinding3.adFrame.addView(inflate.getRoot());
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -1.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        FragmentConversationBinding fragmentConversationBinding4 = this$0.binding;
        if (fragmentConversationBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentConversationBinding2 = fragmentConversationBinding4;
        }
        fragmentConversationBinding2.adFrame.startAnimation(translateAnimation);
    }

    private final void populateNativeAdView(NativeAd nativeAd, AdNativeLayoutBinding unifiedAdBinding) {
        NativeAdView root = unifiedAdBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "unifiedAdBinding.root");
        root.setMediaView(unifiedAdBinding.adMedia);
        root.setHeadlineView(unifiedAdBinding.adHeadline);
        root.setBodyView(unifiedAdBinding.adBody);
        root.setCallToActionView(unifiedAdBinding.adCallToAction);
        root.setIconView(unifiedAdBinding.adAppIcon);
        root.setPriceView(unifiedAdBinding.adPrice);
        root.setStarRatingView(unifiedAdBinding.adStars);
        root.setStoreView(unifiedAdBinding.adStore);
        root.setAdvertiserView(unifiedAdBinding.adAdvertiser);
        unifiedAdBinding.adHeadline.setText(nativeAd.getHeadline());
        MediaContent mediaContent = nativeAd.getMediaContent();
        if (mediaContent != null) {
            unifiedAdBinding.adMedia.setMediaContent(mediaContent);
        }
        if (nativeAd.getBody() == null) {
            unifiedAdBinding.adBody.setVisibility(8);
        } else {
            unifiedAdBinding.adBody.setVisibility(8);
            unifiedAdBinding.adBody.setText(nativeAd.getBody());
        }
        if (nativeAd.getCallToAction() == null) {
            unifiedAdBinding.adCallToAction.setVisibility(4);
        } else {
            unifiedAdBinding.adCallToAction.setVisibility(0);
            unifiedAdBinding.adCallToAction.setText(nativeAd.getCallToAction());
        }
        if (nativeAd.getIcon() == null) {
            unifiedAdBinding.adAppIcon.setVisibility(8);
        } else {
            ImageView imageView = unifiedAdBinding.adAppIcon;
            NativeAd.Image icon = nativeAd.getIcon();
            imageView.setImageDrawable(icon != null ? icon.getDrawable() : null);
            unifiedAdBinding.adAppIcon.setVisibility(0);
        }
        if (nativeAd.getPrice() == null) {
            unifiedAdBinding.adPrice.setVisibility(8);
        } else {
            unifiedAdBinding.adPrice.setVisibility(8);
            unifiedAdBinding.adPrice.setText(nativeAd.getPrice());
        }
        if (nativeAd.getStore() == null) {
            unifiedAdBinding.adStore.setVisibility(8);
        } else {
            unifiedAdBinding.adStore.setVisibility(8);
            unifiedAdBinding.adStore.setText(nativeAd.getStore());
        }
        if (nativeAd.getStarRating() == null) {
            unifiedAdBinding.adStars.setVisibility(4);
        } else {
            RatingBar ratingBar = unifiedAdBinding.adStars;
            Double starRating = nativeAd.getStarRating();
            Intrinsics.checkNotNull(starRating);
            ratingBar.setRating((float) starRating.doubleValue());
            unifiedAdBinding.adStars.setVisibility(0);
        }
        if (nativeAd.getAdvertiser() == null) {
            unifiedAdBinding.adAdvertiser.setVisibility(4);
        } else {
            unifiedAdBinding.adAdvertiser.setText(nativeAd.getAdvertiser());
            unifiedAdBinding.adAdvertiser.setVisibility(0);
        }
        root.setNativeAd(nativeAd);
        MediaContent mediaContent2 = nativeAd.getMediaContent();
        VideoController videoController = mediaContent2 != null ? mediaContent2.getVideoController() : null;
        if (videoController != null && mediaContent2.hasVideoContent()) {
            videoController.setVideoLifecycleCallbacks(new VideoController.VideoLifecycleCallbacks() { // from class: dev.cct.translatorapp.ads.ConversationFragment$populateNativeAdView$2
                @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
                public void onVideoEnd() {
                    super.onVideoEnd();
                }
            });
        } else {
            Log.e("TAG", "Video status: Ad does not contain a video asset. ");
        }
    }

    /* compiled from: ConversationFragment.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Ldev/cct/translatorapp/ads/ConversationFragment$Companion;", "", "()V", "newInstance", "Ldev/cct/translatorapp/ads/ConversationFragment;", "param1", "", "param2", "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ConversationFragment newInstance(String param1, String param2) {
            Intrinsics.checkNotNullParameter(param1, "param1");
            Intrinsics.checkNotNullParameter(param2, "param2");
            ConversationFragment conversationFragment = new ConversationFragment();
            Bundle bundle = new Bundle();
            bundle.putString("param1", param1);
            bundle.putString("param2", param2);
            conversationFragment.setArguments(bundle);
            return conversationFragment;
        }
    }
}
