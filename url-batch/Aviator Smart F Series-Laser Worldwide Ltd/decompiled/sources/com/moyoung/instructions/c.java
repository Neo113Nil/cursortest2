package com.moyoung.instructions;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.moyoung.instructions.utils.InstructionsType;
import com.moyoung.instructions.widgets.BottomDialog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class c {
    private static final Map<Context, BottomDialog> dialogMap = new HashMap();

    public static void hideDialog(Context context) {
        BottomDialog bottomDialog = dialogMap.get(context);
        if (bottomDialog != null) {
            bottomDialog.hide();
        }
    }

    public static void hook(final InstructionsType instructionsType, final View view) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.instructions.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.lambda$hook$1(view, instructionsType, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hook$0(View view, DialogInterface dialogInterface) {
        dialogMap.remove(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$hook$1(final View view, InstructionsType instructionsType, View view2) {
        Map<Context, BottomDialog> map = dialogMap;
        BottomDialog bottomDialog = map.get(view.getContext());
        if (bottomDialog == null) {
            bottomDialog = new BottomDialog(view.getContext(), instructionsType);
            map.put(view.getContext(), bottomDialog);
        }
        if (!bottomDialog.isShowing()) {
            bottomDialog.show();
        }
        bottomDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.instructions.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                c.lambda$hook$0(view, dialogInterface);
            }
        });
    }

    public static void resumeDialog(Context context) {
        BottomDialog bottomDialog = dialogMap.get(context);
        if (bottomDialog != null) {
            bottomDialog.show();
        }
    }
}
