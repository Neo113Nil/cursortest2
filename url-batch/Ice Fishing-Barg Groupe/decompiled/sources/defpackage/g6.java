package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g6 {
    public final h6 PxuCJdSBwIXG;
    public final d6 TSizfFm2Yiuu;
    public final View Y1f8riQaR6yg;
    public final d6 lS5Rgt96tfkO;

    public g6(h6 h6Var, d6 d6Var, d6 d6Var2, View view) {
        this.PxuCJdSBwIXG = h6Var;
        this.lS5Rgt96tfkO = d6Var;
        this.TSizfFm2Yiuu = d6Var2;
        this.Y1f8riQaR6yg = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e9, code lost:
    
        if (r7 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean PxuCJdSBwIXG(Menu menu) {
        int i;
        List actions;
        CharSequence title;
        Icon icon;
        boolean shouldShowIcon;
        CharSequence label;
        Drawable icon2;
        pe2 pe2Var = (pe2) this.lS5Rgt96tfkO.PxuCJdSBwIXG();
        final int i2 = 0;
        if (cs0.wdg6QnbFHrFF(pe2Var, null)) {
            return false;
        }
        menu.clear();
        List list = pe2Var.PxuCJdSBwIXG;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            ne2 ne2Var = (ne2) list.get(i4);
            if (ne2Var instanceof ye2) {
                i = i5 + 1;
                Object obj = ne2Var.PxuCJdSBwIXG;
                final ye2 ye2Var = (ye2) ne2Var;
                MenuItem add = menu.add(i6, cs0.wdg6QnbFHrFF(obj, mm2.EpkonXwzFgDB) ? R.id.cut : cs0.wdg6QnbFHrFF(obj, mm2.xfACYKDMU6Dj) ? R.id.copy : cs0.wdg6QnbFHrFF(obj, mm2.nLZGh9p8gVSu) ? R.id.paste : cs0.wdg6QnbFHrFF(obj, mm2.ryVscX7ZL4Ux) ? R.id.selectAll : cs0.wdg6QnbFHrFF(obj, mm2.amuv7NJvPxHu) ? R.id.autofill : i5, i5, ye2Var.lS5Rgt96tfkO);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: f6
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String text;
                        Intent intent;
                        ActivityOptions pendingIntentBackgroundActivityStartMode;
                        int i7 = i2;
                        Object obj2 = this;
                        Object obj3 = ye2Var;
                        switch (i7) {
                            case 0:
                                ((ye2) obj3).Y1f8riQaR6yg.OPXfSBeufaJ8(((g6) obj2).PxuCJdSBwIXG);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                text = textClassification.getText();
                                int hashCode = text != null ? text.hashCode() : 0;
                                intent = textClassification.getIntent();
                                PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                    break;
                                } else {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        break;
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                        break;
                                    }
                                }
                        }
                        return true;
                    }
                });
            } else {
                if (ne2Var instanceof ef2) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.Y1f8riQaR6yg.getContext();
                        ef2 ef2Var = (ef2) ne2Var;
                        final TextClassification textClassification = ef2Var.lS5Rgt96tfkO;
                        int i7 = ef2Var.TSizfFm2Yiuu;
                        if (i7 < 0) {
                            label = textClassification.getLabel();
                            MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i5, label);
                            add2.setShowAsAction(2);
                            icon2 = textClassification.getIcon();
                            add2.setIcon(icon2);
                            add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: f6
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    String text;
                                    Intent intent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    int i72 = i3;
                                    Object obj2 = textClassification;
                                    Object obj3 = context;
                                    switch (i72) {
                                        case 0:
                                            ((ye2) obj3).Y1f8riQaR6yg.OPXfSBeufaJ8(((g6) obj2).PxuCJdSBwIXG);
                                            break;
                                        default:
                                            Context context2 = (Context) obj3;
                                            TextClassification textClassification2 = (TextClassification) obj2;
                                            text = textClassification2.getText();
                                            int hashCode = text != null ? text.hashCode() : 0;
                                            intent = textClassification2.getIntent();
                                            PendingIntent activity = PendingIntent.getActivity(context2, hashCode, intent, 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                                break;
                                            } else {
                                                try {
                                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                                    break;
                                                } catch (PendingIntent.CanceledException e) {
                                                    Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                                    break;
                                                }
                                            }
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            actions = textClassification.getActions();
                            final RemoteAction TSizfFm2Yiuu = we2.TSizfFm2Yiuu(actions.get(i7));
                            int i9 = i8 != 0 ? 16908353 : i2;
                            title = TSizfFm2Yiuu.getTitle();
                            MenuItem add3 = menu.add(R.id.textAssist, i9, i5, title);
                            add3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (i8 == 0) {
                                shouldShowIcon = TSizfFm2Yiuu.shouldShowIcon();
                            }
                            icon = TSizfFm2Yiuu.getIcon();
                            add3.setIcon(icon.loadDrawable(context));
                            add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: fj2
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    PendingIntent actionIntent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    actionIntent = TSizfFm2Yiuu.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (ne2Var instanceof cf2) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}
