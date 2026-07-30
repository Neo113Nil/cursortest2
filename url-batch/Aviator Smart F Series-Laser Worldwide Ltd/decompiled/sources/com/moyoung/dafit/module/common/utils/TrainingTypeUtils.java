package com.moyoung.dafit.module.common.utils;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class TrainingTypeUtils {
    private static final int BASE_TRAINING_TYPE = 48;
    private static final int MAX_TRAINING_TYPE = 127;
    private static final int MIN_TRAINING_TYPE = 0;
    private static final int[] RUNNING_TRAINING_TYPE_ARRAY = {0, 1, 20, 25, 26, 27, 30, 31, 32, 33, 34, 53, 126};
    private static final int[] BALL_TRAINING_TYPE_ARRAY = {4, 5, 6, 8, 9, 10, 11, 15, 99, 100, 101, 102, 103, 104, 106, 107, 108, 109};
    private static final int[] PACE_CHART_TYPE_ARRAY = {0, 1, 16, 20, 25, 26, 27, 30, 31, 32, 33, 34, 53};

    public enum TrainingType {
        RUNNING,
        BALL,
        OTHER
    }

    private TrainingTypeUtils() {
    }

    public static List<Integer> getTrainingDataTypeList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 <= 127; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static TrainingType getTrainingType(int i8) {
        int trainingType = toTrainingType(i8);
        for (int i9 : RUNNING_TRAINING_TYPE_ARRAY) {
            if (trainingType == i9) {
                return TrainingType.RUNNING;
            }
        }
        for (int i10 : BALL_TRAINING_TYPE_ARRAY) {
            if (trainingType == i10) {
                return TrainingType.BALL;
            }
        }
        return TrainingType.OTHER;
    }

    public static boolean isPaceChartType(Integer num) {
        if (num == null) {
            return false;
        }
        int trainingType = toTrainingType(num.intValue());
        for (int i8 : PACE_CHART_TYPE_ARRAY) {
            if (trainingType == i8) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTotalStepType(Integer num) {
        return (getTrainingType(num.intValue()) == TrainingType.RUNNING) || (getTrainingType(num.intValue()) == TrainingType.BALL) || isPaceChartType(num);
    }

    public static int toTrainingDataType(int i8) {
        return i8;
    }

    public static int toTrainingType(int i8) {
        return i8;
    }
}
