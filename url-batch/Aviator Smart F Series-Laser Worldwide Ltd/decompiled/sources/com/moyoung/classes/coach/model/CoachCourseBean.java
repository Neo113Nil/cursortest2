package com.moyoung.classes.coach.model;

import com.baidu.ar.util.SystemInfoUtil;
import com.moyoung.classes.ClassesLanguageBean;
import com.moyoung.classes.coach.model.net.CoachCourseDetailResp;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCourseBean implements Serializable {
    private final List<CoachActionTypeBean> actionTypeBeanList;
    private final List<Integer> categoryIdList;
    private final String courseZipUrl;
    private final String coverUrl;
    private final String description;
    private final int id;
    private final int kcal;
    private final int level;
    private final List<ClassesLanguageBean> nameLanguageList;
    private final String title;
    private final int totalDuration;

    public CoachCourseBean(int i8, String str, List<ClassesLanguageBean> list, int i9, int i10, int i11, String str2, String str3, List<Integer> list2, String str4, List<CoachActionTypeBean> list3) {
        this.id = i8;
        this.title = str;
        this.nameLanguageList = list;
        this.totalDuration = i9;
        this.kcal = i10;
        this.level = i11;
        this.coverUrl = str2;
        this.description = str3;
        this.categoryIdList = list2;
        this.courseZipUrl = str4;
        this.actionTypeBeanList = list3;
    }

    public static CoachCourseBean convert(CoachCourseDetailResp coachCourseDetailResp) {
        return new CoachCourseBean(coachCourseDetailResp.getId(), coachCourseDetailResp.getName(), coachCourseDetailResp.getName_language(), coachCourseDetailResp.getTotal_time(), coachCourseDetailResp.getCal_length(), coachCourseDetailResp.getLevel(), coachCourseDetailResp.getPicture(), coachCourseDetailResp.getDescription(), coachCourseDetailResp.getCategories(), coachCourseDetailResp.getSource_file(), CoachActionTypeBean.convert(coachCourseDetailResp));
    }

    public List<CoachActionTypeBean> getActionTypeBeanList() {
        return this.actionTypeBeanList;
    }

    public List<Integer> getCategoryIdList() {
        return this.categoryIdList;
    }

    public String getCategoryIdListStr() {
        StringBuilder sb = new StringBuilder();
        for (Integer num : getCategoryIdList()) {
            if (sb.length() == 0) {
                sb = new StringBuilder(String.valueOf(num));
            } else {
                sb.append(SystemInfoUtil.COMMA);
                sb.append(num);
            }
        }
        return sb.toString();
    }

    public String getCourseZipUrl() {
        return this.courseZipUrl;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.id;
    }

    public int getKcal() {
        return this.kcal;
    }

    public int getLevel() {
        return this.level;
    }

    public List<ClassesLanguageBean> getNameLanguageList() {
        return this.nameLanguageList;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTotalDuration() {
        return this.totalDuration;
    }
}
