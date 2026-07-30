package com.moyoung.classes.coach.model;

import com.moyoung.classes.coach.model.net.CoachTagResp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCourseTagBean {
    private final List<CoachCourseShortBean> courseShortList;
    private final int id;
    private final String title;

    public static class CoachCourseShortBean {
        private final int id;
        private final int level;
        private final String thumbUrl;
        private final String title;
        private final int totalDuration;

        public CoachCourseShortBean(int i8, String str, String str2, int i9, int i10) {
            this.id = i8;
            this.title = str;
            this.thumbUrl = str2;
            this.level = i9;
            this.totalDuration = i10;
        }

        public int getId() {
            return this.id;
        }

        public int getLevel() {
            return this.level;
        }

        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public String getTitle() {
            return this.title;
        }

        public int getTotalDuration() {
            return this.totalDuration;
        }
    }

    public CoachCourseTagBean(int i8, String str, List<CoachCourseShortBean> list) {
        this.id = i8;
        this.title = str;
        this.courseShortList = list;
    }

    public static List<CoachCourseTagBean> convert(List<CoachTagResp> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<CoachTagResp> it = list.iterator();
        while (it.hasNext()) {
            CoachCourseTagBean convert = convert(it.next());
            if (convert != null) {
                arrayList.add(convert);
            }
        }
        return arrayList;
    }

    public List<CoachCourseShortBean> getCourseShortList() {
        return this.courseShortList;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public static CoachCourseTagBean convert(CoachTagResp coachTagResp) {
        ArrayList arrayList = new ArrayList();
        for (CoachTagResp.Coach coach : coachTagResp.getCoach()) {
            arrayList.add(new CoachCourseShortBean(coach.getId(), coach.getName(), coach.getThumbnail(), coach.getLevel(), coach.getTotal_time()));
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return new CoachCourseTagBean(coachTagResp.getId(), coachTagResp.getName(), arrayList);
    }
}
