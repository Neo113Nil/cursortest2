package com.crrepa.band.my.device.customkey.util;

import android.text.TextUtils;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.customkey.model.ActionInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyGameType;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.utils.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {
    private static final int[] HAS_DISTANCE_GOAL_TRAINING_TYPE = {0, 1, 53, 20, 25, 26, 27, 126};

    /* renamed from: com.crrepa.band.my.device.customkey.util.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0177a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType;

        static {
            int[] iArr = new int[CRPCustomKeyType.values().length];
            $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType = iArr;
            try {
                iArr[CRPCustomKeyType.KEY_TRAINING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_HEARTRATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODOXYGEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BLOODPRESSURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_HRV.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_CAMERA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_BREATHE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_TIMER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_STOPWATCH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[CRPCustomKeyType.KEY_GAMER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static String capitalize(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if ("ATV".equals(str)) {
            return str;
        }
        String[] split = str.toLowerCase().split(l.SPACE);
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            sb.append(str2.substring(0, 1).toUpperCase() + str2.substring(1));
            sb.append(l.SPACE);
        }
        return sb.toString().trim();
    }

    public static String getActionDescribe(CRPCustomKeyType cRPCustomKeyType, byte b8, byte b9) {
        String string = d.get().getString(R.string.action_button_open_content, c.getCustomKeyFeatureTitle(cRPCustomKeyType));
        switch (C0177a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[cRPCustomKeyType.ordinal()]) {
            case 1:
                return d.get().getString(new int[]{R.string.action_button_time_goal_content, R.string.action_button_calories_goal_content, R.string.action_button_distance_goal_content, R.string.action_button_open_goal_content}[b8]);
            case 2:
            case 3:
            case 4:
            case 5:
                return string + l.SPACE + d.get().getString(R.string.action_button_open_measure_content);
            case 6:
                if (b9 == 0) {
                    return string;
                }
                return string + l.SPACE + d.get().getString(R.string.action_button_open_take_phone_content);
            case 7:
                String string2 = d.get().getString(R.string.action_button_open_set_time_content);
                if (b9 == 0) {
                    return d.get().getString(R.string.action_button_open_content, d.get().getString(R.string.action_button_Stresse)) + l.SPACE + string2;
                }
                return d.get().getString(R.string.action_button_open_content, d.get().getString(R.string.action_button_falling_asleep)) + l.SPACE + string2;
            case 8:
                if (b9 == 0) {
                    return string;
                }
                return string + l.SPACE + d.get().getString(R.string.action_button_open_start_timing_content);
            case 9:
                return b9 == 0 ? string : d.get().getString(R.string.action_button_set_countdown_content);
            case 10:
                return d.get().getString(R.string.action_button_open_content, b9 == 0 ? "2048" : b9 == 1 ? d.get().getString(R.string.action_button_game_battleship) : b9 == 2 ? d.get().getString(R.string.action_button_game_hamster) : d.get().getString(R.string.action_button_game_floopy)) + l.SPACE + d.get().getString(R.string.action_button_open_play_content);
            default:
                return "";
        }
    }

    public static ArrayList<ActionInfo> getActionList(CRPCustomKeyType cRPCustomKeyType, int i8) {
        switch (C0177a.$SwitchMap$com$crrepa$ble$conn$type$CRPCustomKeyType[cRPCustomKeyType.ordinal()]) {
            case 1:
                return getExerciseList(i8);
            case 2:
            case 3:
            case 4:
            case 5:
                return getMeasureList(cRPCustomKeyType);
            case 6:
                return getShutterList(cRPCustomKeyType);
            case 7:
                return getRelaxationList();
            case 8:
                return getStopWatchList(cRPCustomKeyType);
            case 9:
                return getTimerList(cRPCustomKeyType);
            case 10:
                return getGameList();
            default:
                return new ArrayList<>();
        }
    }

    private static ArrayList<ActionInfo> getExerciseList(int i8) {
        boolean z7;
        int[] iArr = {R$drawable.ic_exercise_min, R$drawable.ic_exercise_kcal, R$drawable.ic_exercise_km, R$drawable.ic_exercise_goal};
        int[] iArr2 = {R.string.action_button_time_goal_content, R.string.action_button_calories_goal_content, R.string.action_button_distance_goal_content, R.string.action_button_open_goal_content};
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        int[] iArr3 = HAS_DISTANCE_GOAL_TRAINING_TYPE;
        int length = iArr3.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                z7 = false;
                break;
            }
            if (i8 == iArr3[i9]) {
                z7 = true;
                break;
            }
            i9++;
        }
        int i10 = 0;
        while (i10 < 4) {
            if (z7 || i10 != 2) {
                ActionInfo actionInfo = new ActionInfo();
                actionInfo.setIcon(iArr[i10]);
                actionInfo.setDescribe(iArr2[i10]);
                actionInfo.setHasGoal(i10 != 3);
                actionInfo.setActionIndex((byte) i10);
                arrayList.add(actionInfo);
            }
            i10++;
        }
        return arrayList;
    }

    private static ArrayList<ActionInfo> getGameList() {
        int[] iArr = {R$drawable.ic_game_2048, R$drawable.ic_game_battleship, R$drawable.ic_game_hamster, R$drawable.ic_game_floopy};
        List<CRPCustomKeyGameType> customKeyGameList = b.getCustomKeyGameList();
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        for (int i8 = 0; i8 < customKeyGameList.size(); i8++) {
            ActionInfo actionInfo = new ActionInfo();
            CRPCustomKeyGameType cRPCustomKeyGameType = customKeyGameList.get(i8);
            actionInfo.setIcon(iArr[cRPCustomKeyGameType.getValue()]);
            String string = d.get().getString(R.string.action_button_open_play_content);
            actionInfo.setDescribe(d.get().getString(R.string.action_button_open_content, cRPCustomKeyGameType.getValue() == 0 ? "2048" : cRPCustomKeyGameType.getValue() == 1 ? d.get().getString(R.string.action_button_game_battleship) : cRPCustomKeyGameType.getValue() == 2 ? d.get().getString(R.string.action_button_game_hamster) : d.get().getString(R.string.action_button_game_floopy)) + l.SPACE + string);
            actionInfo.setActionIndex(cRPCustomKeyGameType.getValue());
            arrayList.add(actionInfo);
        }
        return arrayList;
    }

    private static ArrayList<ActionInfo> getMeasureList(CRPCustomKeyType cRPCustomKeyType) {
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        String customKeyFeatureTitle = c.getCustomKeyFeatureTitle(cRPCustomKeyType);
        String string = d.get().getString(R.string.action_button_open_measure_content);
        String string2 = d.get().getString(R.string.action_button_open_content, customKeyFeatureTitle);
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setDescribe(string2 + l.SPACE + string);
        actionInfo.setSelected(true);
        actionInfo.setActionIndex((byte) 1);
        arrayList.add(actionInfo);
        return arrayList;
    }

    private static ArrayList<ActionInfo> getRelaxationList() {
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        ActionInfo actionInfo = new ActionInfo();
        String string = d.get().getString(R.string.action_button_Stresse);
        String string2 = d.get().getString(R.string.action_button_open_set_time_content);
        actionInfo.setDescribe(d.get().getString(R.string.action_button_open_content, string) + l.SPACE + string2);
        actionInfo.setHasGoal(true);
        actionInfo.setActionIndex((byte) 0);
        arrayList.add(actionInfo);
        ActionInfo actionInfo2 = new ActionInfo();
        actionInfo2.setDescribe(d.get().getString(R.string.action_button_open_content, d.get().getString(R.string.action_button_falling_asleep)) + l.SPACE + string2);
        actionInfo2.setHasGoal(true);
        actionInfo2.setActionIndex((byte) 1);
        arrayList.add(actionInfo2);
        return arrayList;
    }

    private static ArrayList<ActionInfo> getShutterList(CRPCustomKeyType cRPCustomKeyType) {
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        String string = d.get().getString(R.string.action_button_open_content, c.getCustomKeyFeatureTitle(cRPCustomKeyType));
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setDescribe(string);
        actionInfo.setActionIndex((byte) 0);
        arrayList.add(actionInfo);
        return arrayList;
    }

    private static ArrayList<ActionInfo> getStopWatchList(CRPCustomKeyType cRPCustomKeyType) {
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        String string = d.get().getString(R.string.action_button_open_content, c.getCustomKeyFeatureTitle(cRPCustomKeyType));
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setDescribe(string);
        actionInfo.setActionIndex((byte) 0);
        arrayList.add(actionInfo);
        ActionInfo actionInfo2 = new ActionInfo();
        actionInfo2.setDescribe(string + l.SPACE + d.get().getString(R.string.action_button_open_start_timing_content));
        actionInfo2.setActionIndex((byte) 1);
        arrayList.add(actionInfo2);
        return arrayList;
    }

    private static ArrayList<ActionInfo> getTimerList(CRPCustomKeyType cRPCustomKeyType) {
        ArrayList<ActionInfo> arrayList = new ArrayList<>();
        String string = d.get().getString(R.string.action_button_open_content, c.getCustomKeyFeatureTitle(cRPCustomKeyType));
        ActionInfo actionInfo = new ActionInfo();
        actionInfo.setDescribe(string);
        actionInfo.setActionIndex((byte) 0);
        arrayList.add(actionInfo);
        ActionInfo actionInfo2 = new ActionInfo();
        actionInfo2.setDescribe(d.get().getString(R.string.action_button_set_countdown_content));
        actionInfo2.setHasGoal(true);
        actionInfo2.setActionIndex((byte) 1);
        arrayList.add(actionInfo2);
        return arrayList;
    }
}
