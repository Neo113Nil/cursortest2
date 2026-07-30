package s3;

import com.crrepa.band.my.model.UserSettingModel;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void renderGoalStepsChange(int i8);

    void renderUserSettingList(List<UserSettingModel> list);

    void updateUnreadNews(UserSettingModel.SettingType settingType, int i8);
}
