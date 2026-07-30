package com.crrepa.band.my.device.customkey.model;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;

/* loaded from: classes2.dex */
public enum OptionTrainingType {
    POPULAR(0, R$drawable.ic_training_01_walking, R.string.sport_popular),
    WATER_SPORT(1, R$drawable.ic_training_08_swimming, R.string.sport_water_sports),
    OUTDOOR_ACTIVITIES(2, R$drawable.ic_training_51_rock_climbing, R.string.sport_outdoor_activities),
    TRAININGS(3, R$drawable.ic_training_58_stair_climber, R.string.sport_trainings),
    DANCE(4, R$drawable.ic_training_81_square_dancing, R.string.options_sport_dance),
    COMBAT_SPORTS(5, R$drawable.ic_training_89_boxing, R.string.sport_combat_sports),
    BALL_SPORTS(6, R$drawable.ic_training_100_volleyball, R.string.sport_ball_sports),
    WINTER_SPORTS(7, R$drawable.ic_training_111_ice_skating, R.string.sport_winter_sports),
    RECREATIONAL_SPORTS(8, R$drawable.ic_training_118_archery, R.string.sport_recreational_sports),
    OTHERS_SPORTS(9, R$drawable.ic_training_123_house_riding, R.string.sport_other_sports);

    private final int icon;
    private final int name;
    private final int value;

    OptionTrainingType(int i8, int i9, int i10) {
        this.value = i8;
        this.icon = i9;
        this.name = i10;
    }

    public int getIcon() {
        return this.icon;
    }

    public int getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}
