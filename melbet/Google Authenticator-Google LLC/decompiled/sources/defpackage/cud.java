package defpackage;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.TextViewContainer;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class cud implements hac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cud(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.hac
    public final Object bB() {
        switch (this.b) {
            case 0:
                return new cuu((Activity) this.a);
            case 1:
                return new cir((Context) this.a);
            case 2:
                fwm fwmVar = (fwm) this.a;
                return new dih((Context) fwmVar.b, (kee) fwmVar.a);
            case 3:
                return (doq) ((AtomicReference) this.a).get();
            case 4:
                return (dor) ((AtomicReference) this.a).get();
            case 5:
                dsf dsfVar = (dsf) this.a;
                return new eby(dsfVar.e, dsfVar.b);
            case 6:
                return kvp.g(new kwn(((dwb) this.a).b));
            case 7:
                FrameLayout frameLayout = (FrameLayout) this.a;
                AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout.getContext());
                appCompatTextView.setId(R.id.og_bento_account_menu_title_text);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
                frameLayout.addView(appCompatTextView, new FrameLayout.LayoutParams(-2, -2, 17));
                return new iyi(appCompatTextView, (TextViewContainer) null);
            case 8:
                FrameLayout frameLayout2 = (FrameLayout) this.a;
                ImageView imageView = new ImageView(frameLayout2.getContext());
                imageView.setId(R.id.og_bento_account_menu_title_image);
                frameLayout2.addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
                return new cfe(imageView, (byte[]) null);
            case 9:
                return dja.x((ViewGroup) this.a);
            case 10:
                return dja.x((ViewGroup) this.a);
            case 11:
                FrameLayout frameLayout3 = (FrameLayout) this.a;
                ImageView imageView2 = new ImageView(frameLayout3.getContext());
                imageView2.setContentDescription(null);
                imageView2.setId(R.id.og_bento_card_icon);
                frameLayout3.addView(imageView2, new ViewGroup.LayoutParams(-1, -1));
                return new cfe(imageView2, (byte[]) null);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj = this.a;
                obj.getClass();
                ViewGroup viewGroup = (ViewGroup) obj;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.og_bento_progress_content, viewGroup);
                View findViewById = inflate.findViewById(R.id.og_bento_card_progress_indicator);
                findViewById.getClass();
                View findViewById2 = inflate.findViewById(R.id.og_bento_card_progress_subtitle);
                findViewById2.getClass();
                return new fwm((LinearProgressIndicator) findViewById, new iyi((TextView) findViewById2, (TextViewContainer) null), (char[]) null);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj2 = this.a;
                obj2.getClass();
                return dja.x((ViewGroup) obj2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Object obj3 = this.a;
                obj3.getClass();
                return dja.x((ViewGroup) obj3);
            case 15:
                ViewGroup viewGroup2 = (ViewGroup) this.a;
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(viewGroup2.getContext());
                appCompatTextView2.setMaxLines(1);
                appCompatTextView2.setIncludeFontPadding(false);
                appCompatTextView2.setGravity(16);
                viewGroup2.addView(appCompatTextView2, new ViewGroup.LayoutParams(-2, -2));
                return new iyi(appCompatTextView2, (TextViewContainer) null);
            case 16:
                ViewGroup viewGroup3 = (ViewGroup) this.a;
                ImageView imageView3 = new ImageView(viewGroup3.getContext());
                viewGroup3.addView(imageView3);
                return new cfe(imageView3, (byte[]) null);
            case 17:
                fea e = ((efn) this.a).a.e("/client_streamz/og_android/invalid_user_profile_switch", new fdz("app_package", String.class));
                e.c();
                return e;
            case 18:
                fea e2 = ((efn) this.a).a.e("/client_streamz/og_android/ads_migration_parity", new fdz("result", String.class), new fdz("data_type", String.class), new fdz("title_error", Boolean.class), new fdz("subtitle_error", Boolean.class), new fdz("icon_error", Boolean.class), new fdz("buttons_error", Boolean.class), new fdz("other_error", Boolean.class));
                e2.c();
                return e2;
            case 19:
                fea e3 = ((efn) this.a).a.e("/client_streamz/og_android/switch_profile", new fdz("result", String.class), new fdz("has_category_launcher", Boolean.class), new fdz("has_category_info", Boolean.class), new fdz("user_in_target_user_profiles", Boolean.class), new fdz("api_version", Integer.class), new fdz("app_package", String.class));
                e3.c();
                return e3;
            default:
                fea e4 = ((efn) this.a).a.e("/client_streamz/og_android/g1_capability_parity", new fdz("app_package", String.class), new fdz("matches", Boolean.class));
                e4.c();
                return e4;
        }
    }
}
