package sqip.internal;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import sqip.internal.CardEditorState;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\rH&¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\fR(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lsqip/internal/GenericCardEditor;", "Lsqip/internal/ReadableCardEditor;", "", "requestFocus", "()Z", "Lsqip/internal/CardEditorState;", "state", "", "init", "(Lsqip/internal/CardEditorState;)V", "isVisible", "setVisibility", "(Z)V", "", "getViewPaddingLeft", "()I", "getViewPaddingTop", "getViewPaddingRight", "getViewPaddingBottom", "Lsqip/internal/CardEditorState$Field;", "field", "Landroid/view/View;", "getViewFor", "(Lsqip/internal/CardEditorState$Field;)Landroid/view/View;", "showCard", "showInvisibleCard", "Lkotlin/Function1;", "getStateChangedCallback", "()Lkotlin/jvm/functions/Function1;", "setStateChangedCallback", "(Lkotlin/jvm/functions/Function1;)V", "stateChangedCallback", "Lkotlin/Function0;", "getOnSubmitFunction", "()Lkotlin/jvm/functions/Function0;", "setOnSubmitFunction", "(Lkotlin/jvm/functions/Function0;)V", "onSubmitFunction", "card-entry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface GenericCardEditor extends ReadableCardEditor {
    Function0<Unit> getOnSubmitFunction();

    Function1<CardEditorState, Unit> getStateChangedCallback();

    View getViewFor(CardEditorState.Field field);

    int getViewPaddingBottom();

    int getViewPaddingLeft();

    int getViewPaddingRight();

    int getViewPaddingTop();

    void init(CardEditorState state);

    boolean requestFocus();

    void setOnSubmitFunction(Function0<Unit> function0);

    void setStateChangedCallback(Function1<? super CardEditorState, Unit> function1);

    void setVisibility(boolean isVisible);

    void showInvisibleCard(boolean showCard);
}
