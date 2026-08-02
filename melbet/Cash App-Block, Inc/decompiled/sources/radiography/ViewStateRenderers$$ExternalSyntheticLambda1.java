package radiography;

import android.content.res.Resources;
import android.view.View;
import android.widget.Checkable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ViewStateRenderers$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                AttributeAppendable attributeAppendable = (AttributeAppendable) obj;
                View view = (View) obj2;
                attributeAppendable.getClass();
                view.getClass();
                if (view.getId() != -1 && view.getResources() != null) {
                    try {
                        attributeAppendable.append("id:" + view.getResources().getResourceEntryName(view.getId()));
                    } catch (Resources.NotFoundException unused) {
                    }
                }
                int visibility = view.getVisibility();
                if (visibility == 4) {
                    attributeAppendable.append("INVISIBLE");
                } else if (visibility == 8) {
                    attributeAppendable.append("GONE");
                }
                attributeAppendable.append(view.getWidth() + (char) 215 + view.getHeight() + "px");
                if (view.isFocused()) {
                    attributeAppendable.append("focused");
                }
                if (!view.isEnabled()) {
                    attributeAppendable.append("disabled");
                }
                if (view.isSelected()) {
                    attributeAppendable.append("selected");
                }
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((Integer) obj).intValue() <= ((Integer) obj2).intValue());
            default:
                AttributeAppendable attributeAppendable2 = (AttributeAppendable) obj;
                Checkable checkable = (Checkable) obj2;
                attributeAppendable2.getClass();
                checkable.getClass();
                if (checkable.isChecked()) {
                    attributeAppendable2.append("checked");
                }
                return Unit.INSTANCE;
        }
    }
}
