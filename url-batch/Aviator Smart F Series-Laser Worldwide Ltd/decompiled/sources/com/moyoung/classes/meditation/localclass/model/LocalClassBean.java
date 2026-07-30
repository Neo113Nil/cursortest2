package com.moyoung.classes.meditation.localclass.model;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.moyoung.classes.R$string;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class LocalClassBean implements Serializable {
    private final List<ActionMsg> actionMsgList;

    @RawRes
    private final int animResId;
    private final String description;
    private final int id;
    private final List<String> postscriptList;

    @DrawableRes
    private final int thumbResId;
    private final String title;

    /* renamed from: com.moyoung.classes.meditation.localclass.model.LocalClassBean$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$classes$meditation$localclass$model$LocalClassBean$ActionMsg$ActionType;

        static {
            int[] iArr = new int[ActionMsg.ActionType.values().length];
            $SwitchMap$com$moyoung$classes$meditation$localclass$model$LocalClassBean$ActionMsg$ActionType = iArr;
            try {
                iArr[ActionMsg.ActionType.HOLD_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moyoung$classes$meditation$localclass$model$LocalClassBean$ActionMsg$ActionType[ActionMsg.ActionType.INHALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class ActionMsg implements Serializable {
        private final ActionType actionType;
        private final String description;
        private final int duration;

        @DrawableRes
        private final int resId;

        public enum ActionType {
            INHALE,
            EXHALE,
            HOLD_ON
        }

        public ActionMsg(ActionType actionType, int i8, int i9, String str) {
            this.actionType = actionType;
            this.duration = i8;
            this.resId = i9;
            this.description = str;
        }

        @Nullable
        public static ActionMsg getActionMsgByType(List<ActionMsg> list, ActionType actionType) {
            ActionMsg actionMsg = null;
            for (ActionMsg actionMsg2 : list) {
                if (actionMsg2.getActionType() == actionType) {
                    actionMsg = actionMsg2;
                }
            }
            return actionMsg;
        }

        public static String getActionName(Context context, ActionType actionType) {
            int i8 = AnonymousClass1.$SwitchMap$com$moyoung$classes$meditation$localclass$model$LocalClassBean$ActionMsg$ActionType[actionType.ordinal()];
            return i8 != 1 ? i8 != 2 ? context.getString(R$string.meditation_local_class_exhale_title) : context.getString(R$string.meditation_local_class_inhale_title) : context.getString(R$string.meditation_local_class_hold_on_title);
        }

        public static String getActionTitle(Context context, ActionType actionType) {
            int i8 = AnonymousClass1.$SwitchMap$com$moyoung$classes$meditation$localclass$model$LocalClassBean$ActionMsg$ActionType[actionType.ordinal()];
            return i8 != 1 ? i8 != 2 ? context.getString(R$string.meditation_local_class_exhale_title) : context.getString(R$string.meditation_local_class_inhale_title) : context.getString(R$string.meditation_local_class_posture_title);
        }

        public static int getBreathDuration(List<ActionMsg> list) {
            Iterator<ActionMsg> it = list.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8 += it.next().getDuration();
            }
            return i8;
        }

        public static int getBreathTimes(int i8, List<ActionMsg> list) {
            return (i8 * 60) / getBreathDuration(list);
        }

        public ActionType getActionType() {
            return this.actionType;
        }

        public String getDescription() {
            return this.description;
        }

        public int getDuration() {
            return this.duration;
        }

        public int getResId() {
            return this.resId;
        }
    }

    public LocalClassBean(int i8, String str, String str2, int i9, int i10, List<String> list, List<ActionMsg> list2) {
        this.id = i8;
        this.title = str;
        this.description = str2;
        this.thumbResId = i9;
        this.animResId = i10;
        this.postscriptList = list;
        this.actionMsgList = list2;
    }

    public List<ActionMsg> getActionMsgList() {
        return this.actionMsgList;
    }

    public int getAnimResId() {
        return this.animResId;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.id;
    }

    public List<String> getPostscriptList() {
        return this.postscriptList;
    }

    public int getThumbResId() {
        return this.thumbResId;
    }

    public String getTitle() {
        return this.title;
    }
}
