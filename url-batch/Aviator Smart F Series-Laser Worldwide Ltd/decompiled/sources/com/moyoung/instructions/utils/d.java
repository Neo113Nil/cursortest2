package com.moyoung.instructions.utils;

import com.moyoung.dafit.module.common.utils.u;
import com.moyoung.instructions.R$color;
import com.moyoung.instructions.R$drawable;
import com.moyoung.instructions.R$raw;
import com.moyoung.instructions.R$string;
import com.moyoung.instructions.model.InstructBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class d {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$instructions$utils$InstructionsType;

        static {
            int[] iArr = new int[InstructionsType.values().length];
            $SwitchMap$com$moyoung$instructions$utils$InstructionsType = iArr;
            try {
                iArr[InstructionsType.NOTIFICATIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.BLOOD_OXYGEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.STRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.TRAINING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.SLEEP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.QUICK_REPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.PAIRING_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$moyoung$instructions$utils$InstructionsType[InstructionsType.TAKE_PHOTOS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private static List<InstructBean> getBloodOxygenBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addImageviewBean(arrayList, R$drawable.img_instructions_bo, 12);
        c.addTitleTextviewBean(arrayList, R$string.bloodOxygen_use_guidance_big_title);
        int i8 = R$string.bloodOxygen_use_guidance_text;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 40);
        c.addTitleTextviewBean(arrayList, R$string.bloodOxygen_use_guidance_measure_title);
        c.addContentTextViewBean(arrayList, R$string.bloodOxygen_use_guidance_measure_step1_text, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.bloodOxygen_use_guidance_measure_step2_text, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.bloodOxygen_use_guidance_measure_step3_text, i9, 40);
        c.addContentTextViewBean(arrayList, R$string.common_use_guidance_text_attention, R$color.assist_11, 40);
        return arrayList;
    }

    private static List<InstructBean> getHeartRateBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addImageviewBean(arrayList, R$drawable.img_instructions_hr, 12);
        c.addTitleTextviewBean(arrayList, R$string.heartRate_use_guidance_big_title);
        int i8 = R$string.heartRate_use_guidance_text;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.heartRate_use_guidance_measure_step1_text, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.heartRate_use_guidance_measure_step2_text, i9, 40);
        c.addContentTextViewBean(arrayList, R$string.common_use_guidance_text_attention, R$color.assist_11, 40);
        return arrayList;
    }

    public static List<InstructBean> getInstructionBeanList(InstructionsType instructionsType) {
        switch (a.$SwitchMap$com$moyoung$instructions$utils$InstructionsType[instructionsType.ordinal()]) {
            case 1:
                return getNotificationBeanList();
            case 2:
                return getBloodOxygenBeanList();
            case 3:
                return getHeartRateBeanList();
            case 4:
                return getPressureBeanList();
            case 5:
                return getTrainingBeanList();
            case 6:
                return getSleepBeanList();
            case 7:
                return getQuickReplyBeanList();
            case 8:
                return getPairingFailedBeanList();
            case 9:
                return getTakePhotoBeanList();
            default:
                return new ArrayList();
        }
    }

    public static List<InstructBean> getNotificationBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addTitleTextviewBean(arrayList, R$string.notifications_use_guidance_big_title, 12, 16);
        int i8 = R$string.notifications_use_guidance_big_body;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 12);
        int i10 = R$string.notifications_use_guidance_big1_text;
        int i11 = R$color.assist_11;
        c.addContentTextViewBean(arrayList, i10, i11, 8);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_big2_text, i11, 32);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_tip_title, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_title_1, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_explain_1, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_zh_step_1, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_en_step_1, 40);
        }
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_title_2, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_explain_2, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_zh_step_2, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_en_step_2, 40);
        }
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_title_3, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_explain_3, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_zh_step_3, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_en_step_3, 40);
        }
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_title_4, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_explain_4, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_zh_step_4, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_noti_android_en_step_4, 40);
        }
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_title_5, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.notifications_use_guidance_content_explain_5, i11, 40);
        return arrayList;
    }

    private static List<InstructBean> getPairingFailedBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addVideoViewBean(arrayList, 30, R$raw.match_1, R$raw.match_2, R$raw.match_3);
        c.addTitleTextviewBean(arrayList, R$string.pair_use_guidance_big_title);
        c.addContentTextViewBean(arrayList, R$string.pair_use_guidance_small_title, R$color.assist_14, 12);
        int i8 = R$string.pair_use_guidance_step1_text;
        int i9 = R$color.assist_11;
        c.addContentTextViewBean(arrayList, i8, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.pair_use_guidance_step2_text, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.pair_use_guidance_step3_text, i9, 40);
        return arrayList;
    }

    private static List<InstructBean> getPressureBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addImageviewBean(arrayList, R$drawable.img_instructions_stress, 30);
        c.addTitleTextviewBean(arrayList, R$string.pressure_use_guidance_big_title);
        int i8 = R$string.pressure_use_guidance_big_body;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.pressure_use_guidance_big1_body, i9, 40);
        c.addTitleTextviewBean(arrayList, R$string.pressure_use_guidance_measure_title);
        c.addContentTextViewBean(arrayList, R$string.pressure_use_guidance_measure1_body, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.pressure_use_guidance_measure2_body, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.pressure_use_guidance_measure3_body, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.pressure_use_guidance_measure4_body, i9, 40);
        c.addContentTextViewBean(arrayList, R$string.common_use_guidance_text_attention, R$color.assist_11, 40);
        return arrayList;
    }

    private static List<InstructBean> getQuickReplyBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addTitleTextviewBean(arrayList, R$string.quick_message_use_guidance_big_title, 12, 16);
        int i8 = R$string.quick_message_use_guidance_big_body;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 32);
        c.addContentTextViewBean(arrayList, R$string.quick_message_use_guidance_small_title, i9, 12);
        int i10 = R$string.quick_message_use_guidance_content_1;
        int i11 = R$color.assist_11;
        c.addContentTextViewBean(arrayList, i10, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_call_zh_1, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_call_en_1, 40);
        }
        c.addContentTextViewBean(arrayList, R$string.quick_message_use_guidance_content_2, i11, 16);
        if (u.isZH()) {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_call_zh_2, 40);
        } else {
            c.addImageviewBean(arrayList, R$drawable.img_instructions_call_en_2, 40);
        }
        return arrayList;
    }

    private static List<InstructBean> getSleepBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addImageviewBean(arrayList, R$drawable.img_instructions_sleep, 30);
        c.addTitleTextviewBean(arrayList, R$string.sleep_use_guidance_big_title);
        int i8 = R$string.sleep_use_guidance_big_body;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 40);
        c.addTitleTextviewBean(arrayList, R$string.sleep_use_guidance_big1_title);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big1_step1_body, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big1_step2_body, i9, 40);
        c.addTitleTextviewBean(arrayList, R$string.sleep_use_guidance_big2_title);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big2_step1_body, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big2_step2_body, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big2_step3_body, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big2_step4_body, i9, 40);
        c.addTitleTextviewBean(arrayList, R$string.sleep_use_guidance_big3_title);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big3_step1_body, i9, 8);
        c.addContentTextViewBean(arrayList, R$string.sleep_use_guidance_big3_step2_body, i9, 40);
        c.addContentTextViewBean(arrayList, R$string.common_use_guidance_text_attention, R$color.assist_11, 40);
        return arrayList;
    }

    private static List<InstructBean> getTakePhotoBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addVideoViewBean(arrayList, 30, R$raw.shutter_1, R$raw.shutter_2);
        c.addTitleTextviewBean(arrayList, R$string.take_photos_use_guidance_big_title);
        c.addContentTextViewBean(arrayList, R$string.take_photos_use_guidance_small_title, R$color.assist_14, 12);
        int i8 = R$string.take_photos_use_guidance_step1_text;
        int i9 = R$color.assist_11;
        c.addContentTextViewBean(arrayList, i8, i9, 6);
        c.addContentTextViewBean(arrayList, R$string.take_photos_use_guidance_step2_text, i9, 40);
        return arrayList;
    }

    private static List<InstructBean> getTrainingBeanList() {
        ArrayList arrayList = new ArrayList();
        c.addTitleTextviewBean(arrayList, R$string.exercise_use_guidance_big_title, 12, 16);
        int i8 = R$string.exercise_use_guidance_big_body;
        int i9 = R$color.assist_14;
        c.addContentTextViewBean(arrayList, i8, i9, 32);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_small_title_1, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_1, i9, 12);
        int i10 = R$string.exercise_use_guidance_content_1;
        int i11 = R$color.assist_11;
        c.addContentTextViewBean(arrayList, i10, i11, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_2, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_2, i11, 10);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_3, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_3, i11, 16);
        c.addImageviewBean(arrayList, R$drawable.img_instructions_running, 40);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_small_title_2, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_4, i9, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_4, i11, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_5, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_5, i11, 16);
        c.addImageviewBean(arrayList, R$drawable.img_instructions_yoga, 40);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_6, i11, 12);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_title_6, i9, 10);
        c.addContentTextViewBean(arrayList, R$string.exercise_use_guidance_content_7, i11, 40);
        return arrayList;
    }
}
