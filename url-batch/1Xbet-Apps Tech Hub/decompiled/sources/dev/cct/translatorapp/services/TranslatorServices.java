package dev.cct.translatorapp.services;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.speech.SpeechRecognizer;
import android.speech.tts.TextToSpeech;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.common.util.GmsVersion;
import com.translator.alllanguagetranslations.ath.R;
import dev.cct.translatorapp.LanguageListModel;
import dev.cct.translatorapp.adapter.CustomListAdapter;
import dev.cct.translatorapp.databinding.SmallLayoutBinding;
import dev.cct.translatorapp.interfaces.OnClickCloseItems;
import dev.cct.translatorapp.util.ExtensionFunction;
import dev.cct.translatorapp.util.ExtensionFunctionKt;
import dev.cct.translatorapp.util.Preferences;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TranslatorServices.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0016H\u0002J&\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0011J\b\u0010.\u001a\u00020'H\u0002J\b\u0010/\u001a\u00020\u0016H\u0002J\b\u00100\u001a\u00020'H\u0002J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020'H\u0017J\b\u00106\u001a\u00020'H\u0016J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u0007H\u0016J\b\u00109\u001a\u00020'H\u0002J\u0010\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u001cH\u0002J\u000e\u0010<\u001a\u00020'2\u0006\u0010=\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Ldev/cct/translatorapp/services/TranslatorServices;", "Landroid/app/Service;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_ID", "", "closeButtonVisibilityListener", "Ldev/cct/translatorapp/interfaces/OnClickCloseItems;", "countDownTimer", "Landroid/os/CountDownTimer;", "floatingButton", "Landroidx/cardview/widget/CardView;", "hideButtonReceiver", "Landroid/content/BroadcastReceiver;", "initialTouchX", "", "initialTouchY", "initialX", "initialY", "isDragging", "", "()Z", "setDragging", "(Z)V", "isSmallLayoutVisible", "remainingTimeMillis", "", "smallLayout", "smallLayoutBinding", "Ldev/cct/translatorapp/databinding/SmallLayoutBinding;", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "tts", "Landroid/speech/tts/TextToSpeech;", "windowManager", "Landroid/view/WindowManager;", "broadcastServiceState", "", "isServiceRunning", "calculateDistance", "x1", "y1", "x2", "y2", "createNotificationChannel", "hasOverlayPermission", "initCountDownTimer", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onInit", NotificationCompat.CATEGORY_STATUS, "requestOverlayPermission", "scheduleServiceStart", "timeInMillis", "setCloseButtonVisibilityListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Translator_1.0.32_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslatorServices extends Service implements TextToSpeech.OnInitListener {
    private OnClickCloseItems closeButtonVisibilityListener;
    private CountDownTimer countDownTimer;
    private CardView floatingButton;
    private float initialTouchX;
    private float initialTouchY;
    private int initialX;
    private int initialY;
    private boolean isDragging;
    private boolean isSmallLayoutVisible;
    private CardView smallLayout;
    private SmallLayoutBinding smallLayoutBinding;
    private SpeechRecognizer speechRecognizer;
    private TextToSpeech tts;
    private WindowManager windowManager;
    private final String NOTIFICATION_CHANNEL_ID = "TranslatorServiceChannel";
    private final int NOTIFICATION_ID = 1;
    private long remainingTimeMillis = 7200000;
    private final BroadcastReceiver hideButtonReceiver = new BroadcastReceiver() { // from class: dev.cct.translatorapp.services.TranslatorServices$hideButtonReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            WindowManager windowManager;
            CardView cardView;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            windowManager = TranslatorServices.this.windowManager;
            CardView cardView2 = null;
            if (windowManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                windowManager = null;
            }
            cardView = TranslatorServices.this.floatingButton;
            if (cardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            } else {
                cardView2 = cardView;
            }
            windowManager.removeView(cardView2);
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    /* renamed from: isDragging, reason: from getter */
    public final boolean getIsDragging() {
        return this.isDragging;
    }

    public final void setDragging(boolean z) {
        this.isDragging = z;
    }

    public final void setCloseButtonVisibilityListener(OnClickCloseItems listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.closeButtonVisibilityListener = listener;
    }

    @Override // android.app.Service
    public void onCreate() {
        String str;
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        CardView cardView;
        Notification build;
        super.onCreate();
        if (!hasOverlayPermission()) {
            requestOverlayPermission();
        }
        registerReceiver(this.hideButtonReceiver, new IntentFilter("HIDE_FLOATING_BUTTON_ACTION"), 2);
        TranslatorServices translatorServices = this;
        this.tts = new TextToSpeech(translatorServices, this);
        Object systemService = getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        SmallLayoutBinding inflate = SmallLayoutBinding.inflate(LayoutInflater.from(translatorServices));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.from(this))");
        this.smallLayoutBinding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            inflate = null;
        }
        CardView root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "smallLayoutBinding.root");
        this.smallLayout = root;
        Log.e("timer", "onCreate: " + this.remainingTimeMillis + " //" + new Preferences(translatorServices).isWatchVideo());
        if (new Preferences(translatorServices).getCheckBillingStatus() || !new Preferences(translatorServices).isWatchVideo()) {
            str = "smallLayoutBinding";
        } else {
            str = "smallLayoutBinding";
            long j = getSharedPreferences("TranslatorPrefs", 0).getLong("remainingTime", 7200000L);
            this.remainingTimeMillis = j;
            Log.e("timer", "onCreate: " + j);
            initCountDownTimer();
        }
        SmallLayoutBinding smallLayoutBinding = this.smallLayoutBinding;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding = null;
        }
        smallLayoutBinding.pasteIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$0(TranslatorServices.this, view);
            }
        });
        final WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-1, -2, 2038, 8, -3);
        CardView cardView2 = this.smallLayout;
        if (cardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayout");
            cardView2 = null;
        }
        cardView2.setVisibility(4);
        layoutParams3.gravity = 49;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.translator_margin);
        WindowManager windowManager = this.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        layoutParams3.width = windowManager.getDefaultDisplay().getWidth() - (dimensionPixelSize * 2);
        CustomListAdapter customListAdapter = new CustomListAdapter(translatorServices, android.R.layout.simple_spinner_dropdown_item, ExtensionFunctionKt.getTranslateLangList());
        customListAdapter.setDropDownViewResource(R.layout.spinner_items);
        SmallLayoutBinding smallLayoutBinding2 = this.smallLayoutBinding;
        if (smallLayoutBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding2 = null;
        }
        CustomListAdapter customListAdapter2 = customListAdapter;
        smallLayoutBinding2.inputLangSpinner.setAdapter((SpinnerAdapter) customListAdapter2);
        try {
            Field declaredField = Spinner.class.getDeclaredField("mPopup");
            Intrinsics.checkNotNullExpressionValue(declaredField, "Spinner::class.java.getDeclaredField(\"mPopup\")");
            declaredField.setAccessible(true);
            SmallLayoutBinding smallLayoutBinding3 = this.smallLayoutBinding;
            if (smallLayoutBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                smallLayoutBinding3 = null;
            }
            Object obj = declaredField.get(smallLayoutBinding3.inputLangSpinner);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.widget.ListPopupWindow");
            ((ListPopupWindow) obj).setHeight(1000);
        } catch (Exception e) {
            Log.e("TAG", "spinnerHeight: " + e);
        }
        SmallLayoutBinding smallLayoutBinding4 = this.smallLayoutBinding;
        if (smallLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding4 = null;
        }
        smallLayoutBinding4.ouputLangSpinner.setAdapter((SpinnerAdapter) customListAdapter2);
        try {
            Field declaredField2 = Spinner.class.getDeclaredField("mPopup");
            Intrinsics.checkNotNullExpressionValue(declaredField2, "Spinner::class.java.getDeclaredField(\"mPopup\")");
            declaredField2.setAccessible(true);
            SmallLayoutBinding smallLayoutBinding5 = this.smallLayoutBinding;
            if (smallLayoutBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(str);
                smallLayoutBinding5 = null;
            }
            Object obj2 = declaredField2.get(smallLayoutBinding5.ouputLangSpinner);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type android.widget.ListPopupWindow");
            ((ListPopupWindow) obj2).setHeight(1000);
        } catch (Exception e2) {
            Log.e("TAG", "spinnerHeight: " + e2);
        }
        LanguageListModel languageListModel = ExtensionFunctionKt.getTranslateLangList().get(new Preferences(translatorServices).getInputLangWidget());
        Intrinsics.checkNotNullExpressionValue(languageListModel, "translateLangList[Prefer…es(this).inputLangWidget]");
        LanguageListModel languageListModel2 = languageListModel;
        LanguageListModel languageListModel3 = ExtensionFunctionKt.getTranslateLangList().get(new Preferences(translatorServices).getOutputLangWidget());
        Intrinsics.checkNotNullExpressionValue(languageListModel3, "translateLangList[Prefer…s(this).outputLangWidget]");
        LanguageListModel languageListModel4 = languageListModel3;
        Log.e("services", "onCreate: " + languageListModel2 + " // " + languageListModel4 + " //" + new Preferences(translatorServices).getInputLangWidget());
        int inputLangWidget = new Preferences(translatorServices).getInputLangWidget();
        Log.d("TranslatorServices", "Input Lang Index: " + inputLangWidget);
        SmallLayoutBinding smallLayoutBinding6 = this.smallLayoutBinding;
        if (smallLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding6 = null;
        }
        smallLayoutBinding6.inputLangSpinner.setSelection(inputLangWidget);
        SmallLayoutBinding smallLayoutBinding7 = this.smallLayoutBinding;
        if (smallLayoutBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding7 = null;
        }
        smallLayoutBinding7.inputLangCardTv.setText(getString(languageListModel2.getLangName()));
        SmallLayoutBinding smallLayoutBinding8 = this.smallLayoutBinding;
        if (smallLayoutBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding8 = null;
        }
        smallLayoutBinding8.ouputLangSpinner.setSelection(new Preferences(translatorServices).getOutputLangWidget());
        SmallLayoutBinding smallLayoutBinding9 = this.smallLayoutBinding;
        if (smallLayoutBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding9 = null;
        }
        smallLayoutBinding9.outputLangCardTv.setText(getString(languageListModel4.getLangName()));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = ExtensionFunctionKt.getTranslateLangList().iterator();
        while (it.hasNext()) {
            arrayList.add(getString(((LanguageListModel) it.next()).getLangName()));
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(translatorServices, R.layout.spinner_t, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_t2);
        SmallLayoutBinding smallLayoutBinding10 = this.smallLayoutBinding;
        if (smallLayoutBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding10 = null;
        }
        ArrayAdapter arrayAdapter2 = arrayAdapter;
        smallLayoutBinding10.inputLangSpinner.setAdapter((SpinnerAdapter) arrayAdapter2);
        SmallLayoutBinding smallLayoutBinding11 = this.smallLayoutBinding;
        if (smallLayoutBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding11 = null;
        }
        smallLayoutBinding11.ouputLangSpinner.setAdapter((SpinnerAdapter) arrayAdapter2);
        SmallLayoutBinding smallLayoutBinding12 = this.smallLayoutBinding;
        if (smallLayoutBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding12 = null;
        }
        smallLayoutBinding12.inputLangSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$onCreate$3
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long p3) {
                SmallLayoutBinding smallLayoutBinding13;
                Log.d("tag", TypedValues.TransitionType.S_FROM + position);
                new Preferences(TranslatorServices.this).setInputLangWidget(position);
                smallLayoutBinding13 = TranslatorServices.this.smallLayoutBinding;
                if (smallLayoutBinding13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                    smallLayoutBinding13 = null;
                }
                smallLayoutBinding13.inputLangCardTv.setText(TranslatorServices.this.getString(ExtensionFunctionKt.getTranslateLangList().get(position).getLangName()));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p0) {
                Log.d("tag", "nothingSelected" + p0);
            }
        });
        SmallLayoutBinding smallLayoutBinding13 = this.smallLayoutBinding;
        if (smallLayoutBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding13 = null;
        }
        smallLayoutBinding13.ouputLangSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$onCreate$4
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> p0, View p1, int p2, long p3) {
                SmallLayoutBinding smallLayoutBinding14;
                Log.d("tag", TypedValues.TransitionType.S_FROM + p2);
                new Preferences(TranslatorServices.this).setOutputLangWidget(p2);
                smallLayoutBinding14 = TranslatorServices.this.smallLayoutBinding;
                if (smallLayoutBinding14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                    smallLayoutBinding14 = null;
                }
                smallLayoutBinding14.outputLangCardTv.setText(TranslatorServices.this.getString(ExtensionFunctionKt.getTranslateLangList().get(p2).getLangName()));
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> p0) {
                Log.e("TAG", "onNothingSelected: " + p0);
            }
        });
        SmallLayoutBinding smallLayoutBinding14 = this.smallLayoutBinding;
        if (smallLayoutBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding14 = null;
        }
        smallLayoutBinding14.translateBtn.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$3(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding15 = this.smallLayoutBinding;
        if (smallLayoutBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding15 = null;
        }
        smallLayoutBinding15.speakTextIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$4(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding16 = this.smallLayoutBinding;
        if (smallLayoutBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding16 = null;
        }
        smallLayoutBinding16.speakIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$5(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding17 = this.smallLayoutBinding;
        if (smallLayoutBinding17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding17 = null;
        }
        smallLayoutBinding17.shareTextIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$6(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding18 = this.smallLayoutBinding;
        if (smallLayoutBinding18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding18 = null;
        }
        smallLayoutBinding18.swapCardView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$7(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding19 = this.smallLayoutBinding;
        if (smallLayoutBinding19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding19 = null;
        }
        smallLayoutBinding19.copyTextIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$8(TranslatorServices.this, view);
            }
        });
        SmallLayoutBinding smallLayoutBinding20 = this.smallLayoutBinding;
        if (smallLayoutBinding20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding20 = null;
        }
        smallLayoutBinding20.editText.setOnTouchListener(new View.OnTouchListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda11
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$9;
                onCreate$lambda$9 = TranslatorServices.onCreate$lambda$9(TranslatorServices.this, layoutParams3, view, motionEvent);
                return onCreate$lambda$9;
            }
        });
        SmallLayoutBinding smallLayoutBinding21 = this.smallLayoutBinding;
        if (smallLayoutBinding21 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding21 = null;
        }
        smallLayoutBinding21.editText.addTextChangedListener(new TextWatcher() { // from class: dev.cct.translatorapp.services.TranslatorServices$onCreate$12
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable p0) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int p1, int p2, int p3) {
                SmallLayoutBinding smallLayoutBinding22;
                SmallLayoutBinding smallLayoutBinding23;
                Intrinsics.checkNotNull(s);
                SmallLayoutBinding smallLayoutBinding24 = null;
                if (s.length() > 0) {
                    smallLayoutBinding23 = TranslatorServices.this.smallLayoutBinding;
                    if (smallLayoutBinding23 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                    } else {
                        smallLayoutBinding24 = smallLayoutBinding23;
                    }
                    smallLayoutBinding24.crossIcon.setVisibility(0);
                    return;
                }
                smallLayoutBinding22 = TranslatorServices.this.smallLayoutBinding;
                if (smallLayoutBinding22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                } else {
                    smallLayoutBinding24 = smallLayoutBinding22;
                }
                smallLayoutBinding24.crossIcon.setVisibility(8);
            }
        });
        SmallLayoutBinding smallLayoutBinding22 = this.smallLayoutBinding;
        if (smallLayoutBinding22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            smallLayoutBinding22 = null;
        }
        smallLayoutBinding22.crossIcon.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$10(TranslatorServices.this, view);
            }
        });
        WindowManager windowManager2 = this.windowManager;
        if (windowManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager2 = null;
        }
        CardView cardView3 = this.smallLayout;
        if (cardView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayout");
            cardView3 = null;
        }
        windowManager2.addView(cardView3, layoutParams3);
        CardView cardView4 = new CardView(translatorServices);
        this.floatingButton = cardView4;
        cardView4.setCardElevation(3.0f);
        CardView cardView5 = this.floatingButton;
        if (cardView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView5 = null;
        }
        cardView5.setBackgroundResource(R.drawable.app_icon);
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams = new WindowManager.LayoutParams(120, 120, 2038, 262664, -3);
        } else {
            layoutParams = new WindowManager.LayoutParams(120, 120, AdError.CACHE_ERROR_CODE, 262664, -3);
        }
        layoutParams.gravity = 8388659;
        layoutParams.x = 0;
        layoutParams.y = 100;
        WindowManager windowManager3 = this.windowManager;
        if (windowManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager3 = null;
        }
        CardView cardView6 = this.floatingButton;
        if (cardView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView6 = null;
        }
        windowManager3.addView(cardView6, layoutParams);
        CardView cardView7 = this.floatingButton;
        if (cardView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView7 = null;
        }
        cardView7.bringToFront();
        final ImageView imageView = new ImageView(translatorServices);
        imageView.setImageDrawable(ContextCompat.getDrawable(translatorServices, R.drawable.cancelservices));
        if (Build.VERSION.SDK_INT >= 26) {
            layoutParams2 = new WindowManager.LayoutParams(120, 120, 2038, 8, -3);
        } else {
            layoutParams2 = new WindowManager.LayoutParams(110, 110, AdError.INTERNAL_ERROR_2006, 8, -3);
        }
        layoutParams2.gravity = 81;
        layoutParams2.y = 100;
        WindowManager windowManager4 = this.windowManager;
        if (windowManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager4 = null;
        }
        windowManager4.addView(imageView, layoutParams2);
        imageView.setVisibility(4);
        CardView cardView8 = this.floatingButton;
        if (cardView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView = null;
        } else {
            cardView = cardView8;
        }
        cardView.setOnTouchListener(new View.OnTouchListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean onCreate$lambda$11;
                onCreate$lambda$11 = TranslatorServices.onCreate$lambda$11(TranslatorServices.this, imageView, view, motionEvent);
                return onCreate$lambda$11;
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TranslatorServices.onCreate$lambda$12(TranslatorServices.this, imageView, view);
            }
        });
        createNotificationChannel();
        if (Build.VERSION.SDK_INT >= 26) {
            createNotificationChannel();
            build = new Notification.Builder(translatorServices, this.NOTIFICATION_CHANNEL_ID).setContentTitle("Translator Service").setContentText("Running in the background").setSmallIcon(R.drawable.app_icon).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder(this, NOTIFICATI…\n                .build()");
        } else {
            build = new Notification.Builder(translatorServices).setContentTitle("Translator Service").setContentText("Running in the background").setSmallIcon(R.drawable.app_icon).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder(this)\n          …\n                .build()");
        }
        startForeground(this.NOTIFICATION_ID, build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorServices translatorServices = this$0;
        if (ExtensionFunction.INSTANCE.getFromClipboard(translatorServices) != null) {
            SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
            if (smallLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                smallLayoutBinding = null;
            }
            smallLayoutBinding.editText.append(ExtensionFunction.INSTANCE.getFromClipboard(translatorServices));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(final TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        if (ExtensionFunction.INSTANCE.checkInternetConnection(this$0)) {
            SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
            SmallLayoutBinding smallLayoutBinding2 = null;
            if (smallLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                smallLayoutBinding = null;
            }
            Editable text = smallLayoutBinding.editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "smallLayoutBinding.editText.text");
            if (text.length() > 0) {
                SmallLayoutBinding smallLayoutBinding3 = this$0.smallLayoutBinding;
                if (smallLayoutBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                    smallLayoutBinding3 = null;
                }
                smallLayoutBinding3.progressLoadingData.setVisibility(0);
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TranslatorServices$onCreate$5$1(this$0, null), 3, null);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: dev.cct.translatorapp.services.TranslatorServices$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        TranslatorServices.onCreate$lambda$3$lambda$2(TranslatorServices.this);
                    }
                }, 500L);
                SmallLayoutBinding smallLayoutBinding4 = this$0.smallLayoutBinding;
                if (smallLayoutBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                } else {
                    smallLayoutBinding2 = smallLayoutBinding4;
                }
                smallLayoutBinding2.ouputCardView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3$lambda$2(TranslatorServices this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        smallLayoutBinding.progressLoadingData.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.speak("textToSpeak", 0, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$5(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        TextToSpeech textToSpeech3 = this$0.tts;
        if (textToSpeech3 != null) {
            SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
            if (smallLayoutBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                smallLayoutBinding = null;
            }
            textToSpeech3.speak(smallLayoutBinding.editText.getText().toString(), 0, null, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$6(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        OnClickCloseItems onClickCloseItems = this$0.closeButtonVisibilityListener;
        if (onClickCloseItems != null) {
            onClickCloseItems.onCloseButtonClicked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TranslatorServices translatorServices = this$0;
        int inputLangWidget = new Preferences(translatorServices).getInputLangWidget();
        new Preferences(translatorServices).setInputLangWidget(new Preferences(translatorServices).getOutputLangWidget());
        new Preferences(translatorServices).setOutputLangWidget(inputLangWidget);
        SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
        SmallLayoutBinding smallLayoutBinding2 = null;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        smallLayoutBinding.inputLangSpinner.setSelection(new Preferences(translatorServices).getInputLangWidget());
        SmallLayoutBinding smallLayoutBinding3 = this$0.smallLayoutBinding;
        if (smallLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding3 = null;
        }
        smallLayoutBinding3.inputLangCardTv.setText(this$0.getString(ExtensionFunctionKt.getTranslateLangList().get(new Preferences(translatorServices).getInputLangWidget()).getLangName()));
        SmallLayoutBinding smallLayoutBinding4 = this$0.smallLayoutBinding;
        if (smallLayoutBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding4 = null;
        }
        smallLayoutBinding4.ouputLangSpinner.setSelection(new Preferences(translatorServices).getOutputLangWidget());
        SmallLayoutBinding smallLayoutBinding5 = this$0.smallLayoutBinding;
        if (smallLayoutBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding5 = null;
        }
        smallLayoutBinding5.outputLangCardTv.setText(this$0.getString(ExtensionFunctionKt.getTranslateLangList().get(new Preferences(translatorServices).getOutputLangWidget()).getLangName()));
        SmallLayoutBinding smallLayoutBinding6 = this$0.smallLayoutBinding;
        if (smallLayoutBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding6 = null;
        }
        Editable text = smallLayoutBinding6.editText.getText();
        SmallLayoutBinding smallLayoutBinding7 = this$0.smallLayoutBinding;
        if (smallLayoutBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding7 = null;
        }
        CharSequence text2 = smallLayoutBinding7.outputTxt.getText();
        SmallLayoutBinding smallLayoutBinding8 = this$0.smallLayoutBinding;
        if (smallLayoutBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding8 = null;
        }
        smallLayoutBinding8.editText.setText(text2);
        SmallLayoutBinding smallLayoutBinding9 = this$0.smallLayoutBinding;
        if (smallLayoutBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
        } else {
            smallLayoutBinding2 = smallLayoutBinding9;
        }
        smallLayoutBinding2.outputTxt.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object systemService = this$0.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(r0, smallLayoutBinding.outputTxt.getText()));
        if (Build.VERSION.SDK_INT <= 32) {
            Toast.makeText(this$0, "Copied To Clipboard", 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$9(TranslatorServices this$0, WindowManager.LayoutParams smallLayoutParams, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(smallLayoutParams, "$smallLayoutParams");
        SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
        CardView cardView = null;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        smallLayoutBinding.editText.setCursorVisible(true);
        smallLayoutParams.flags = 288;
        WindowManager windowManager = this$0.windowManager;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        CardView cardView2 = this$0.smallLayout;
        if (cardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayout");
        } else {
            cardView = cardView2;
        }
        windowManager.updateViewLayout(cardView, smallLayoutParams);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$10(TranslatorServices this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SmallLayoutBinding smallLayoutBinding = this$0.smallLayoutBinding;
        SmallLayoutBinding smallLayoutBinding2 = null;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        smallLayoutBinding.editText.setText("");
        SmallLayoutBinding smallLayoutBinding3 = this$0.smallLayoutBinding;
        if (smallLayoutBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
        } else {
            smallLayoutBinding2 = smallLayoutBinding3;
        }
        smallLayoutBinding2.ouputCardView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onCreate$lambda$11(TranslatorServices this$0, ImageView closeButton, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(closeButton, "$closeButton");
        int action = motionEvent.getAction();
        CardView cardView = null;
        CardView cardView2 = null;
        CardView cardView3 = null;
        WindowManager windowManager = null;
        CardView cardView4 = null;
        if (action == 1) {
            CardView cardView5 = this$0.floatingButton;
            if (cardView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView5 = null;
            }
            cardView5.setElevation(0.0f);
            int i = Resources.getSystem().getDisplayMetrics().heightPixels;
            float rawY = motionEvent.getRawY();
            CardView cardView6 = this$0.floatingButton;
            if (cardView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView6 = null;
            }
            if (rawY >= i - cardView6.getHeight()) {
                WindowManager windowManager2 = this$0.windowManager;
                if (windowManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                    windowManager2 = null;
                }
                CardView cardView7 = this$0.floatingButton;
                if (cardView7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                    cardView7 = null;
                }
                windowManager2.removeView(cardView7);
                WindowManager windowManager3 = this$0.windowManager;
                if (windowManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                } else {
                    windowManager = windowManager3;
                }
                windowManager.removeView(closeButton);
                this$0.stopSelf();
                TextToSpeech textToSpeech = this$0.tts;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
                TextToSpeech textToSpeech2 = this$0.tts;
                if (textToSpeech2 != null) {
                    textToSpeech2.shutdown();
                }
                this$0.broadcastServiceState(false);
            } else {
                if (this$0.isSmallLayoutVisible) {
                    CardView cardView8 = this$0.smallLayout;
                    if (cardView8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smallLayout");
                    } else {
                        cardView4 = cardView8;
                    }
                    cardView4.setVisibility(4);
                } else {
                    CardView cardView9 = this$0.smallLayout;
                    if (cardView9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smallLayout");
                    } else {
                        cardView = cardView9;
                    }
                    cardView.setVisibility(0);
                }
                this$0.isSmallLayoutVisible = !this$0.isSmallLayoutVisible;
            }
            if (this$0.isDragging) {
                if (this$0.isSmallLayoutVisible) {
                    closeButton.setVisibility(4);
                } else {
                    closeButton.setVisibility(0);
                }
                this$0.isSmallLayoutVisible = !this$0.isSmallLayoutVisible;
            }
            this$0.isDragging = false;
        } else if (action == 2) {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() < 100) {
                CardView cardView10 = this$0.floatingButton;
                if (cardView10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                } else {
                    cardView2 = cardView10;
                }
                cardView2.setElevation(10.0f);
                return true;
            }
            if (!this$0.isDragging && motionEvent.getEventTime() - motionEvent.getDownTime() >= 10) {
                this$0.isDragging = true;
            }
            CardView cardView11 = this$0.floatingButton;
            if (cardView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView11 = null;
            }
            cardView11.setElevation(10.0f);
            CardView cardView12 = this$0.floatingButton;
            if (cardView12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView12 = null;
            }
            ViewGroup.LayoutParams layoutParams = cardView12.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            CardView cardView13 = this$0.floatingButton;
            if (cardView13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView13 = null;
            }
            cardView13.bringToFront();
            int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
            layoutParams2.x = (int) (this$0.initialX + (motionEvent.getRawX() - this$0.initialTouchX));
            if (layoutParams2.x < 0) {
                layoutParams2.x = 0;
            } else {
                int i4 = layoutParams2.x;
                CardView cardView14 = this$0.floatingButton;
                if (cardView14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                    cardView14 = null;
                }
                if (i4 > i2 - cardView14.getWidth()) {
                    CardView cardView15 = this$0.floatingButton;
                    if (cardView15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                        cardView15 = null;
                    }
                    layoutParams2.x = i2 - cardView15.getWidth();
                }
            }
            layoutParams2.y = (int) (this$0.initialY + (motionEvent.getRawY() - this$0.initialTouchY));
            if (layoutParams2.y < 0) {
                layoutParams2.y = 0;
            } else {
                int i5 = layoutParams2.y;
                CardView cardView16 = this$0.floatingButton;
                if (cardView16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                    cardView16 = null;
                }
                if (i5 > i3 - cardView16.getHeight()) {
                    CardView cardView17 = this$0.floatingButton;
                    if (cardView17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                        cardView17 = null;
                    }
                    layoutParams2.y = i3 - cardView17.getHeight();
                }
            }
            WindowManager windowManager4 = this$0.windowManager;
            if (windowManager4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                windowManager4 = null;
            }
            CardView cardView18 = this$0.floatingButton;
            if (cardView18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView18 = null;
            }
            windowManager4.updateViewLayout(cardView18, layoutParams2);
            float rawY2 = motionEvent.getRawY();
            CardView cardView19 = this$0.floatingButton;
            if (cardView19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            } else {
                cardView3 = cardView19;
            }
            if (rawY2 >= i3 - cardView3.getHeight()) {
                closeButton.setVisibility(0);
                closeButton.setImageDrawable(ContextCompat.getDrawable(this$0, R.drawable.cancel__3_widg));
            } else {
                closeButton.setVisibility(0);
                closeButton.setImageDrawable(ContextCompat.getDrawable(this$0, R.drawable.cancelservices));
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$12(TranslatorServices this$0, ImageView closeButton, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(closeButton, "$closeButton");
        WindowManager windowManager = this$0.windowManager;
        WindowManager windowManager2 = null;
        if (windowManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            windowManager = null;
        }
        CardView cardView = this$0.floatingButton;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView = null;
        }
        windowManager.removeView(cardView);
        WindowManager windowManager3 = this$0.windowManager;
        if (windowManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("windowManager");
        } else {
            windowManager2 = windowManager3;
        }
        windowManager2.removeView(closeButton);
        this$0.stopSelf();
        TextToSpeech textToSpeech = this$0.tts;
        if (textToSpeech != null) {
            textToSpeech.stop();
        }
        TextToSpeech textToSpeech2 = this$0.tts;
        if (textToSpeech2 != null) {
            textToSpeech2.shutdown();
        }
        this$0.broadcastServiceState(false);
    }

    public final float calculateDistance(float x1, float y1, float x2, float y2) {
        float f = x1 - x2;
        float f2 = y1 - y2;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [dev.cct.translatorapp.services.TranslatorServices$initCountDownTimer$1] */
    public final void initCountDownTimer() {
        Log.e("TAG", "onTick timer: " + this.remainingTimeMillis);
        final long j = this.remainingTimeMillis;
        CountDownTimer start = new CountDownTimer(j) { // from class: dev.cct.translatorapp.services.TranslatorServices$initCountDownTimer$1
            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                SmallLayoutBinding smallLayoutBinding;
                long j2;
                TranslatorServices.this.remainingTimeMillis = millisUntilFinished;
                long j3 = millisUntilFinished / 1000;
                long j4 = 3600;
                long j5 = j3 / j4;
                long j6 = 60;
                long j7 = (j3 % j4) / j6;
                long j8 = j3 % j6;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j7), Long.valueOf(j8)}, 3));
                Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                smallLayoutBinding = TranslatorServices.this.smallLayoutBinding;
                if (smallLayoutBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
                    smallLayoutBinding = null;
                }
                smallLayoutBinding.timer.setText(format);
                j2 = TranslatorServices.this.remainingTimeMillis;
                Log.e("TAG", "onTick: " + j2 + " //" + millisUntilFinished);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                new Preferences(TranslatorServices.this).setWatchVideo(false);
                TranslatorServices.this.remainingTimeMillis = 0L;
                TranslatorServices.this.initCountDownTimer();
                TranslatorServices.this.scheduleServiceStart(System.currentTimeMillis() + GmsVersion.VERSION_PARMESAN);
                TranslatorServices.this.stopSelf();
            }
        }.start();
        Intrinsics.checkNotNullExpressionValue(start, "private fun initCountDow…         }.start()\n\n    }");
        this.countDownTimer = start;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleServiceStart(long timeInMillis) {
        Object systemService = getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        TranslatorServices translatorServices = this;
        ((AlarmManager) systemService).set(0, timeInMillis, PendingIntent.getService(translatorServices, 0, new Intent(translatorServices, (Class<?>) TranslatorServices.class), 335544320));
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(this.NOTIFICATION_CHANNEL_ID, "Translator Service Channel", 3);
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }

    private final boolean hasOverlayPermission() {
        return Settings.canDrawOverlays(this);
    }

    private final void requestOverlayPermission() {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.addFlags(268435456);
        startActivity(intent);
        stopSelf();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        CardView cardView = this.floatingButton;
        WindowManager windowManager = null;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
            cardView = null;
        }
        if (cardView.isAttachedToWindow()) {
            WindowManager windowManager2 = this.windowManager;
            if (windowManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
                windowManager2 = null;
            }
            CardView cardView2 = this.floatingButton;
            if (cardView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("floatingButton");
                cardView2 = null;
            }
            windowManager2.removeView(cardView2);
        }
        stopForeground(true);
        SmallLayoutBinding smallLayoutBinding = this.smallLayoutBinding;
        if (smallLayoutBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("smallLayoutBinding");
            smallLayoutBinding = null;
        }
        CardView root = smallLayoutBinding.getRoot();
        if (root.isAttachedToWindow()) {
            WindowManager windowManager3 = this.windowManager;
            if (windowManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("windowManager");
            } else {
                windowManager = windowManager3;
            }
            windowManager.removeView(root);
        }
        SharedPreferences.Editor edit = getSharedPreferences("TranslatorPrefs", 0).edit();
        edit.putLong("remainingTime", this.remainingTimeMillis);
        edit.apply();
        unregisterReceiver(this.hideButtonReceiver);
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int status) {
        if (status == 0) {
            TextToSpeech textToSpeech = this.tts;
            Integer valueOf = textToSpeech != null ? Integer.valueOf(textToSpeech.setLanguage(Locale.US)) : null;
            if ((valueOf != null && valueOf.intValue() == -1) || (valueOf != null && valueOf.intValue() == -2)) {
                Log.e("TextToSpeechService", "Language not supported");
                return;
            }
            return;
        }
        Log.e("TextToSpeechService", "Initialization failed");
    }

    private final void broadcastServiceState(boolean isServiceRunning) {
        Intent intent = new Intent("SERVICE_STATE_ACTION");
        intent.putExtra("isServiceRunning", isServiceRunning);
        sendBroadcast(intent);
    }
}
