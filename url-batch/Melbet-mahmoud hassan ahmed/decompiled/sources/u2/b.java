package u2;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import r2.o;

@Deprecated
/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    private o f22461f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView.ScaleType f22462g;

    public b(@RecentlyNonNull Context context) {
        super(context);
    }

    public void setImageScaleType(@RecentlyNonNull ImageView.ScaleType scaleType) {
        this.f22462g = scaleType;
    }

    public void setMediaContent(@RecentlyNonNull o oVar) {
        this.f22461f = oVar;
    }
}
