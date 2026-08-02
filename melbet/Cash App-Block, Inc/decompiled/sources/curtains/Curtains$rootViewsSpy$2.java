package curtains;

import android.content.res.Resources;
import android.util.Log;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import curtains.internal.RootViewsSpy;
import curtains.internal.WindowManagerSpy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Curtains$rootViewsSpy$2 extends Lambda implements Function0 {
    public static final Curtains$rootViewsSpy$2 INSTANCE;
    public static final Curtains$rootViewsSpy$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE = new Curtains$rootViewsSpy$2(i, 0);
        INSTANCE$1 = new Curtains$rootViewsSpy$2(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Curtains$rootViewsSpy$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Field field;
        switch (this.$r8$classId) {
            case 0:
                RootViewsSpy rootViewsSpy = new RootViewsSpy();
                WindowsKt$onNextDraw$1 windowsKt$onNextDraw$1 = new WindowsKt$onNextDraw$1(rootViewsSpy, 17);
                try {
                    Object value = WindowManagerSpy.windowManagerInstance$delegate.getValue();
                    if (value != null && (field = (Field) WindowManagerSpy.mViewsField$delegate.getValue()) != null) {
                        Object obj = field.get(value);
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<android.view.View> /* = java.util.ArrayList<android.view.View> */");
                        }
                        field.set(value, windowsKt$onNextDraw$1.invoke((ArrayList) obj));
                    }
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                }
                return rootViewsSpy;
            default:
                try {
                    return Resources.getSystem().getString(Resources.getSystem().getIdentifier("tooltip_popup_title", InquiryField.StringField.TYPE, "android"));
                } catch (Resources.NotFoundException unused) {
                    return "Tooltip";
                }
        }
    }
}
