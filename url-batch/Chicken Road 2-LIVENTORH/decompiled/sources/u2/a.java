package u2;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.emoji2.text.q;
import com.google.android.material.button.MaterialButtonToggleGroup;
import w0.h;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a implements v1.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3355a;

    public a(ScrollView scrollView, Button button) {
        this.f3355a = button;
    }

    public a(TextView textView) {
        this.f3355a = new h(textView);
    }

    public a(EditText editText) {
        this.f3355a = new q(editText);
    }

    public a(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f3355a = materialButtonToggleGroup;
    }
}
